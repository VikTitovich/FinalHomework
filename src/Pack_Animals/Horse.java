package Pack_Animals;
// Класс Horse наследуется от класса Animal

import Resource.Animal;

public class Horse extends Animal {
	public Horse(String name, String skills) {
		super(name, skills);
	}

	@Override
	public void displayCommands() {
		System.out.println("Список команд для коня:");
		System.out.println(getSkills());
	}

	@Override
	public void teachNewCommand(String command) {
		String updatedSkills = getSkills() + "," + command;
		setSkills(updatedSkills);
	}
}