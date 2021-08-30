package ArrayStack;

public class Player {
    private String playerName;
    private int jerseyNo;

    public Player(String playerName, int jerseyNo) {
        this.playerName = playerName;
        this.jerseyNo = jerseyNo;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getJerseyNo() {
        return jerseyNo;
    }

    public void setJerseyNo(int jerseyNo) {
        this.jerseyNo = jerseyNo;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", jerseyNo=" + jerseyNo +
                '}';
    }


}
