/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragonknight.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author gee
 */
public class Monster implements Serializable { 
    private String name;
    private String description;
    private double hitPoint;
    private String itemDrop;

    public Monster() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(double hitPoint) {
        this.hitPoint = hitPoint;
    }

    public String getItemDrop() {
        return itemDrop;
    }

    public void setItemDrop(String itemDrop) {
        this.itemDrop = itemDrop;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.hitPoint) ^ (Double.doubleToLongBits(this.hitPoint) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.itemDrop);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Monster other = (Monster) obj;
        if (Double.doubleToLongBits(this.hitPoint) != Double.doubleToLongBits(other.hitPoint)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.itemDrop, other.itemDrop)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Monster{" + "name=" + name + ", description=" + description + ", hitPoint=" + hitPoint + ", itemDrop=" + itemDrop + '}';
    }
    
    
}
