import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int wins = 0;
        int loses = 0;

        System.out.println("File:");
        String fileName = scan.nextLine();
        
        System.out.println("Team:");
        String teamName = scan.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {

            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                String[] parts = row.split(",");

                String homeTeamName = parts[0];
                String awayTeamName = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int awayTeamPoints = Integer.valueOf(parts[3]);

                if (teamName.equals(homeTeamName) || teamName.equals(awayTeamName)) {
                    count++;
                    if (teamName.equals(homeTeamName) && homeTeamPoints > awayTeamPoints) {
                        wins++;
                    } else if (teamName.equals(awayTeamName) && awayTeamPoints > homeTeamPoints) {
                        wins++;
                    } else {
                        loses++;
                    }
                }
            }

            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + loses);

        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
        }
    }
}
