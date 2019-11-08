package trinsdar.poormetals.blocks;

public enum BlockPooreOreTypes {
    //vanilla
    IRON("iron", 4.0F, 1),
    GOLD("gold", 4.0F, 2),

    //base metals
    COPPER("copper", 4.0F, 1),
    TIN("tin", 4.0F, 0),
    SILVER("silver", 4.0F, 1),
    LEAD("lead", 4.0F, 0),
    NICKEL("nickel", 4.0F, 1),
    ZINC("zinc", 4.0F, 0),
    MERCURY("mercury", 4.0F, 0),
    PLATINUM("platinum", 4.0F, 0),
    BISMUTH("bismuth", 4.0F, 0),
    ANTIMONY("antimony", 4.0F, 0),
    ADAMANTINE("adamantine", 4.0F, 3),
    COLD_IRON("cold_iron", 4.0F, 2),
    STARSTEEL("starsteel", 4.0F, 3),

    //modern metals
    ALUMINUM("aluminum", 4.0F, 0),
    BERYLLIUM("beryllium", 4.0F, 1),
    BORON("boron", 4.0F, 2),
    CADMIUM("cadmium", 4.0F, 0),
    CHROMIUM("chromium", 4.0F, 2),
    IRIDIUM("iridium", 4.0F, 1),
    MAGNESIUM("magnesium", 4.0F, 0),
    MAGANESE("maganese", 4.0F, 1),
    OSMIUM("osmium", 4.0F, 2),
    PLUTONIUM("plutonium", 4.0F, 1),
    RUTILE("rutile", 4.0F, 1),
    TANTALUM("tantalum", 4.0F, 1),
    THORIUM("thorium", 4.0F, 0),
    TITANIUM("titanium", 4.0F, 1),
    TUNGSTEN("tungsten", 4.0F, 2),
    URANIUM("uranium", 4.0F, 1),
    ZIRCONIUM("zirconium", 4.0F, 1);

    private float hardness;
    private int harvest;
    private String name;

    BlockPooreOreTypes(String name, float hardness, int harvest){
        this.name = name;
        this.hardness = hardness;
        this.harvest = harvest;
    }

    public String getName() {
        return name;
    }

    public float getHardness(){
        return hardness;
    }

    public int getHarvest(){
        return harvest;
    }
}
