import java.util.ArrayList;

import com.jreale4.RPG.server.Attack;
import com.jreale4.RPG.server.Move;
import com.jreale4.RPG.server.MoveType;



public class AttackTest{
	private Attack attack1;
	private Attack attack2;
	private Attack attack3;
	private Attack attack4;
	ArrayList<Attack> a = new ArrayList<Attack>();
	
	protected void setUp(){
		attack1= new Attack(MoveType.physical, Move.slash);
		attack2= new Attack(MoveType.water, Move.magic);
		attack3= new Attack(MoveType.physical, Move.stab);
		attack4= new Attack(MoveType.earth, Move.magic);
		a.add(attack1);
		a.add(attack2);
		a.add(attack3);
		a.add(attack4);
	}
	
	public void testGetMoveType(){
		assertEqualsMT(MoveType.physical,attack1.getMoveType());
		assertEqualsMT(MoveType.water,attack2.getMoveType());
		assertEqualsMT(MoveType.physical,attack3.getMoveType());
		assertEqualsMT(MoveType.earth,attack4.getMoveType());
	}

	public void testGetMove(){
		assertEqualsM(Move.slash,attack1.getMove());
		assertEqualsM(Move.magic,attack2.getMove());
		assertEqualsM(Move.stab,attack3.getMove());
		assertEqualsM(Move.magic,attack4.getMove());
	}
	
	public void testGetPower(){
		
	}
	
	private void assertEqualsMT(MoveType one, MoveType two) {
		if(one.compareTo(two)==0){
			
		} else{
			
		}
	}
	
	private void assertEqualsM(Move one, Move two) {
		if(one.compareTo(two)==0){
			
		} else{
			
		}
	}

}
