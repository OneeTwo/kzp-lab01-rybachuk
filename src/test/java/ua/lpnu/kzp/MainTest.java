package ua.lpnu.kzp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @TempDir
    Path tempDir;

    @Test
    void shouldCalculateGymStatistics() throws Exception {
        Path input = tempDir.resolve("input.csv");
        Path output = tempDir.resolve("report.txt");

        Files.writeString(input, """
                Іван Петренко;Standard;3;24;1500.00
                Марія Коваль;Premium;12;110;6500.00
                Олег Бондар;Basic;1;8;700.00
                """, StandardCharsets.UTF_8);

        Main.main(new String[]{
            "--input", input.toString(),
            "--output", output.toString()
        });

        String report = Files.readString(output, StandardCharsets.UTF_8);

        assertTrue(report.contains("Valid records: 3"));
        assertTrue(report.contains("Average visits: 47.33"));
        assertTrue(report.contains("Total revenue: 8700.00"));
        assertTrue(report.contains("Longest membership: 12 months"));
    }

    @Test
    void shouldSkipInvalidRecords() throws Exception {
        Path input = tempDir.resolve("input.csv");
        Path output = tempDir.resolve("report.txt");

        Files.writeString(input, """
                Іван Петренко;Standard;3;24;1500.00
                Анна Мельник;Premium;-3;20;1800.00
                Тарас Іванчук;Standard;6;abc;2800.00
                """, StandardCharsets.UTF_8);

        Main.main(new String[]{
            "--input", input.toString(),
            "--output", output.toString()
        });

        String report = Files.readString(output, StandardCharsets.UTF_8);

        assertTrue(report.contains("Valid records: 1"));
        assertTrue(report.contains("Average visits: 24.00"));
        assertTrue(report.contains("Total revenue: 1500.00"));
        assertTrue(report.contains("Longest membership: 3 months"));
    }
}
