package pacotePrincipal;

public class Player {

    private String Id;
    ;
    private String Name;
    private String GuildId;
    private String GuildName;
    private String AllianceId;
    private String AllianceName;
    private String Avatar;
    private String AvatarRing;
    private int KillFame;
    private int DeathFame;
    private double FameRatio;
    private Integer totalKills;
    private Integer gvgKills;
    private Integer gvgWon;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGuildId() {
        return GuildId;
    }

    public void setGuildId(String GuildId) {
        this.GuildId = GuildId;
    }

    public String getGuildName() {
        return GuildName;
    }

    public void setGuildName(String GuildName) {
        this.GuildName = GuildName;
    }

    public String getAllianceId() {
        return AllianceId;
    }

    public void setAllianceId(String AllianceId) {
        this.AllianceId = AllianceId;
    }

    public String getAllianceName() {
        return AllianceName;
    }

    public void setAllianceName(String AllianceName) {
        this.AllianceName = AllianceName;
    }

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    public String getAvatarRing() {
        return AvatarRing;
    }

    public void setAvatarRing(String AvatarRing) {
        this.AvatarRing = AvatarRing;
    }

    public int getKillFame() {
        return KillFame;
    }

    public void setKillFame(int KillFame) {
        this.KillFame = KillFame;
    }

    public int getDeathFame() {
        return DeathFame;
    }

    public void setDeathFame(int DeathFame) {
        this.DeathFame = DeathFame;
    }

    public double getFameRatio() {
        return FameRatio;
    }

    public void setFameRatio(double FameRatio) {
        this.FameRatio = FameRatio;
    }

    public Integer getTotalKills() {
        return totalKills;
    }

    public void setTotalKills(Integer totalKills) {
        this.totalKills = totalKills;
    }

    public Integer getGvgKills() {
        return gvgKills;
    }

    public void setGvgKills(Integer gvgKills) {
        this.gvgKills = gvgKills;
    }

    public Integer getGvgWon() {
        return gvgWon;
    }

    public void setGvgWon(Integer gvgWon) {
        this.gvgWon = gvgWon;
    }
}
