package com.example.fruit_service_oa2.bean;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.Objects;

@Tag(name="村民所属土地信息",description = "包括面积，大小，位置等")
public class Land {
    @Schema(name="唯一标识的id")
    int land_id;
    @Schema(name="土地面积",type = "float")
    float area;
    @Schema(name="土地的位置",type = "String")
    String location;
    @Schema(name="土地产量",type = "float")
    float yield;
    @Schema(name="所属户主",type = "int")
    int v_id;
    @Schema(name="平均树龄",type = "int")
    int avg_tree_age;

    public int getLand_id() {
        return land_id;
    }

    public void setLand_id(int land_id) {
        this.land_id = land_id;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getYield() {
        return yield;
    }

    public void setYield(float yield) {
        this.yield = yield;
    }

    public int getV_id() {
        return v_id;
    }

    public void setV_id(int v_id) {
        this.v_id = v_id;
    }

    public int getAvg_tree_age() {
        return avg_tree_age;
    }

    public void setAvg_tree_age(int avg_tree_age) {
        this.avg_tree_age = avg_tree_age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Land land = (Land) o;
        return land_id == land.land_id && Float.compare(area, land.area) == 0 && Float.compare(yield, land.yield) == 0 && v_id == land.v_id && avg_tree_age == land.avg_tree_age && Objects.equals(location, land.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(land_id, area, location, yield, v_id, avg_tree_age);
    }

    @Override
    public String toString() {
        return "Land{" +
                "land_id=" + land_id +
                ", area=" + area +
                ", location='" + location + '\'' +
                ", yield=" + yield +
                ", v_id=" + v_id +
                ", avg_tree_age=" + avg_tree_age +
                '}';
    }
}
