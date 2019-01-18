package trinsdar.poormetals.blocks;

public enum BlockPooreOreTypes {
    //vanilla
    IRON(4.0F, 1),
    GOLD(4.0F, 2),

    //base metals
    COPPER(4.0F, 1),
    TIN(4.0F, 0),
    SILVER(4.0F, 1),
    LEAD(4.0F, 0),
    NICKEL(4.0F, 1),
    ZINC(4.0F, 0),
    MERCURY(4.0F, 0),
    PLATINUM(4.0F, 0),
    BISMUTH(4.0F, 0),
    ANTIMONY(4.0F, 0),
    ADAMANTINE(4.0F, 3),
    COLD_IRON(4.0F, 2),
    STARSTEEL(4.0F, 3),

    //modern metals
    ALUMINUM(4.0F, 0),
    BERYLLIUM(4.0F, 1),
    BORON(4.0F, 2),
    CADMIUM(4.0F, 0),
    CHROMIUM(4.0F, 2),
    IRIDIUM(4.0F, 1),
    MAGNESIUM(4.0F, 0),
    MAGANESE(4.0F, 1),
    OSMIUM(4.0F, 2),
    PLUTONIUM(4.0F, 1),
    RUTILE(4.0F, 1),
    TANTALUM(4.0F, 1),
    THORIUM(4.0F, 0),
    TITANIUM(4.0F, 1),
    TUNGSTEN(4.0F, 2),
    URANIUM(4.0F, 1),
    ZIRCONIUM(4.0F, 1);

    private float hardness;
    private int harvest;

    BlockPooreOreTypes(float hardness, int harvest){
        this.hardness = hardness;
        this.harvest = harvest;
    }

    public float getHardness(){
        return hardness;
    }

    public int getHarvest(){
        return harvest;
    }
}
