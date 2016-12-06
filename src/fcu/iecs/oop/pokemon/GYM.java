package fcu.iecs.oop.pokemon;

import java.awt.Window.Type;
import java.util.Random;

public class GYM {

	public static Player fight(Player...players)
	{
		Random ran = new Random();	
		int a=ran.nextInt(2);
		int count1 = 0,count2=0;
		
		Pokemon[] p1=players[0].getPokemons();
		Pokemon[] p2=players[1].getPokemons();
		for(int i=0;i<3;i++)
		{
			if(p1[i].getType()==PokemonType.FIRE&&p2[i].getType()==PokemonType.GRASS)
		{
			count1++;
		}
		else if(p2[i].getType()==PokemonType.FIRE&&p1[i].getType()==PokemonType.GRASS)
		{
			count2++;
		}
		else if(p1[i].getType()==PokemonType.GRASS&&p2[i].getType()==PokemonType.WATER)
		{
			count1++;
		}
		else if(p2[i].getType()==PokemonType.GRASS&&p1[i].getType()==PokemonType.WATER)
		{
			count2++;
		}
		else if(p1[i].getType()==PokemonType.WATER&&p2[i].getType()==PokemonType.FIRE)
		{
			count1++;
		}
		else if(p2[i].getType()==PokemonType.WATER&&p1[i].getType()==PokemonType.FIRE)
		{
			count2++;
		}
		else if(p1[i].getType()==p2[i].getType())
		{
			if(p1[i].getCp()>p2[i].getCp())
			{
				count1++;
			}
			else if(p1[i].getCp()<p2[i].getCp())
			{
				count2++;
			}
			else
			{
				if(a==1)
				{
					count1++;
				}
				else
				{
					count2++;
				}
			
			}
		}
	
			
			if(count1>=2)
			{
				break;
			}
			else if(count2>=2)
			{
				break;
			}
		}
		
		if(count1>count2)
		{
			int level = players[0].getLevel();
			players[0].setLevel(level+1);
			System.out.printf("Winner is %s, and his/her level becomes %d.",players[0].getPlayerName(),players[0].getLevel());
			return players[0];
		}
		else
		{
			int level2= players[1].getLevel();
			players[1].setLevel(level2+1);
			System.out.printf("Winner is %s, and his/her level becomes %d.",players[1].getPlayerName(),players[1].getLevel());
			return players[1];
		}
		
	
	}

}
