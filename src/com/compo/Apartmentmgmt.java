package com.compo;

import java.util.ArrayList;
import java.util.List;

class Room{
	String type;
	int length;
	int width;
	public Room(String type, int length, int width) {
		super();
		this.type = type;
		this.length = length;
		this.width = width;
	}
	@Override
	public String toString() {
		//System.out.println("=============================================");
		return "\nRoom [type=" + type + ", length=" + length + ", width=" + width + "]";
	}
	
}

class Flat{
	int number;
	String facing;
	int sft;
	List<Room> rooms;
	public Flat(int number, String facing, int sft, List<Room> rooms) {
		super();
		this.number = number;
		this.facing = facing;
		this.sft = sft;
		this.rooms = rooms;
	}
	@Override
	public String toString() {
		return "Flat [number=" + number + ", facing=" + facing + ", sft=" + sft + ", rooms=" + rooms + "]";
	}
	
	
}

public class Apartmentmgmt {

	public static void main(String[] args) {
		Room room1=new Room("living Room",40,25);
		Room room2=new Room("Kitchen",20,10);
		Room room3=new Room("Bed Room1",25,25);
		Room room4=new Room("Bed Room2",20,20);
		Room room5=new Room("Bed Room",20,20);
		List<Room> list=new ArrayList<Room>();
		list.add(room1);
		list.add(room2);
		list.add(room3);
		list.add(room4);
		list.add(room5);
      Flat flat1=new Flat(1,"East",2000,list);
		
		System.out.println(flat1);
	}

}
