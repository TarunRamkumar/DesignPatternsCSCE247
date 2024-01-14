package strategy;

import java.util.ArrayList;
import java.util.Random;
/**
 * A hockey team
 * @author Portia
 */
public class Team {
    private String teamName;
    private ArrayList<Player> players;
    private boolean possession;
    private Random random;
    /**
     * Creates a new hockey team
     * @param teamName
     */
    public Team(String teamName) {
        this.teamName = teamName;
        players = new ArrayList<Player>();
        random = new Random();
        possession = random.nextBoolean();
    }
    /**
     * Adds a new player to the team given their information 
     * @param firstName
     * @param lastName
     * @param type
     */
    public void addTeamMember(String firstName, String lastName, PlayerType type) {
        if (type.equals(PlayerType.GOALIE)) {
            players.add(new Goalie(firstName, lastName));
        } else if (type.equals(PlayerType.FORWARD)) {
            players.add(new Forward(firstName, lastName));
        } else if (type.equals(PlayerType.DEFENCE_MAN)) {
            players.add(new Defenceman(firstName, lastName));
        } else {
            System.out.println("Sorry, " + teamName + " wasn't added to the team.");
        }
    }
    /**
     * Changes the possession of the puck for the team
     */
    public void changePossession() {
        possession = !possession;
    }
    /**
     * Describes the action each member of the team does during a certain play
     */
    public void executePlay() {
        for (Player player : players) {
            System.out.println(player + " - " + player.play(possession));
        }
    }
    /**
     * Returns the players on the team
     * @return An ArrayList containing the players on the team. 
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }
    /**
     * Returns the team's name 
     * @return A string representation of the team's name. 
     */
    public String getName() {
        return teamName;
    }
    /**
     * Checks to see if the team has possesion 
     * @return A boolean that returns if the player has possession or not. 
     */
    public boolean hasPossession() {
        return possession;
    }
}
