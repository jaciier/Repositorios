package com.hoteles.certifications.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class RandomSelect implements Interaction{
	private Target select;
	private String hoteles;

	long hotel=Math.round(Math.random()*8)+1;
	int number = Math.toIntExact(hotel);
	//random para selccionar hotel.
	public RandomSelect(Target select, String hoteles) {
		this.select = select;
		this.hoteles = hoteles;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
				select.resolveAllFor(actor).get(number).click();
			
		}
	
	
	public static RandomSelect join(Target select, String hoteles) {
		return Tasks.instrumented(RandomSelect.class, select, hoteles);
	}
}
