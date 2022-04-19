package pacotePrincipal;
public class Guild {
      private String Id;
      private String Name;
      private String AllianceId;
      private String AllianceName;
      private Integer KillFame;
      private int DeathFame;

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

    public Integer getKillFame() {
        return KillFame;
    }

    public void setKillFame(Integer KillFame) {
        this.KillFame = KillFame;
    }

    public int getDeathFame() {
        return DeathFame;
    }

    public void setDeathFame(int DeathFame) {
        this.DeathFame = DeathFame;
    }
}
