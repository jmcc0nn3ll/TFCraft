package TFC.API.Entities;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;

public interface IAnimal
{
	public enum GenderEnum
	{
		MALE,FEMALE;
		public static final GenderEnum[] genders = {MALE, FEMALE};
	}

	public GenderEnum getGender();
	
	public int getSex();

	public int getBirthDay();
	/**
	 * @return The length of time (in days) until this type of animal reatures maturity
	 */
	public int getNumberOfDaysToAdult();

	public boolean isAdult();
	
	//public int getSex();
	/**
	 * @return Size modifier of the animal. Used for rendering and various other purposes.
	 * Size is primarilly affected by the area the animal lives in; forests generally have smaller animals, as do colder climates.
	 */
	public float getSize();
	
	/**
	 * @return Strength modifier of the animal. Used for rendering and various other purposes.
	 * Absolute strength is affected by size, but inherant musculature also plays a roll.
	 */
	public float getStrength();
	
	/**
	 * @return Aggression modifier of the animal. Used for rendering and various other purposes.
	 * Aggression affects how likely an animal is to attack another player or animal and the ferocity of which it does so.
	 */
	public float getAggression();
	
	/**
	 * @return Obedience modifier of the animal. Used for rendering and various other purposes.
	 * Obedience affects how well the animal responds to player commands and how willingly it does so.
	 * Obedience and Aggression collectively determine whether an animal is domesticated.
	 */
	public float getObedience();
	
	/**
	 * @return Colour modifier of the animal. Used for rendering and various other purposes.
	 * Colour is generally unrelated to animal traits, and is determined either by the biome the animal lives in or from the animal's parents.
	 */
	public float getColour();
	
	/**
	 * @return Climate Adaptation modifier of the animal. Used for rendering and various other purposes.
	 * Climate Adaptation refers to the temperature and wetness range the animal is best suited to; 
	 * and defines what climates the animal does more poorly in.
	 */
	public float getClimateAdaptation();
	
	/**
	 * @return Hardiness modifier of the animal. Used for rendering and various other purposes.
	 * Hardiness is a derivative of Climate Adaptation, and refers to how well the animal survives with limited resources. 
	 * Hardier animals thrive with abundant resources.
	 */
	public float getHardiness();

	
	
	public boolean isPregnant();
	
	public EntityAgeable createChildTFC(EntityAgeable entityageable);

	//	It would be nice to call this isInLove() except that would shadow
	//	EntityAnimal.isInLove() causing MCP to obfuscate this method, which
	//	we don't want because the callers won't be obfuscated.
	//	
	public boolean getInLove();

	public void setInLove(boolean b);

	public EntityLiving getEntity();

	public boolean canMateWith(IAnimal animal);

	public void mate(IAnimal animal);

	public long getAnimalID();
	
	public void setAge(int par1);

	public void setAnimalID(long id);

	public int getHunger();

	public void setHunger(int h);

}
