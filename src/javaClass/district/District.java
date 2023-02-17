package javaClass.district;

public class District {
    private int gardenArea;
    private Building[] buildings;
    District(Building buildings[], int gardenArea){
        setBuildings(buildings);
        setGardenArea(gardenArea);
    }


    // getter setter for area
    public void setGardenArea(int gardenArea) {
        this.gardenArea = gardenArea;
    }
    public int getGardenArea() {
        return gardenArea;
    }


    // getter setter for buildings array
    public void setBuildings(Building[] buildings) {
        this.buildings = buildings;
    }

    public Building[] getBuildings() {
        return buildings;
    }


    public double availableArea(){
        double floorsCount = 0;
        for (int i = 0; i < buildings.length; i++)
        {
            floorsCount += buildings[i].getFloorsOfBuildings();
        }
        return getGardenArea() / (floorsCount * 4);
    }

}
