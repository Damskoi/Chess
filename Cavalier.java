import java.util.ArrayList;

public class Cavalier extends Piece {

    public Cavalier(Case cases) {
        super(cases);
    }

    public String toString() {
    	if (couleur==Couleur.blanc)
    		return "CB";
    	return "CN";
    }

    public Cavalier(Case cases,Couleur coul,int i) {
    	super(cases);
        couleur=coul;
        setI(i);
    }

    public boolean verification(Case c2) {
        if (c2!=null &&(((c2.getRange()==cases.getRange()+2 || c2.getRange()==cases.getRange()-2) && (c2.getColonne()==cases.getColonne()+1 || c2.getColonne()==cases.getColonne()-1)) || ((c2.getRange()==cases.getRange()+1 || c2.getRange()==cases.getRange()-1) && (c2.getColonne()==cases.getColonne()+2 || c2.getColonne()==cases.getColonne()-2)))&& (c2.getPiece()==null || getCouleur()!=c2.getPiece().getCouleur()))
            return true;
        return false;
    }

    public ArrayList<Case> possibilite(){
        int i=cases.getRange();
        int j=cases.getColonne();
        ArrayList<Case>tab=new ArrayList<Case>();
        if (verification(Echiquier.ech.gcase(i+2,j+1)))
        {
        		tab.add(Echiquier.ech.gcase(i+2,j+1));
                
        }
        if (verification(Echiquier.ech.gcase(i+2,j-1)))
        {
        		tab.add(Echiquier.ech.gcase(i+2,j-1));
        		            
        }
        if (verification(Echiquier.ech.gcase(i-2,j-1)))
        {
        		tab.add(Echiquier.ech.gcase(i-2,j-1));
        		            
        }
        if (verification(Echiquier.ech.gcase(i-2,j+1)))
        {
        		 tab.add(Echiquier.ech.gcase(i-2,j+1));
        		 
        }
        if (verification(Echiquier.ech.gcase(i+1,j-2)))
        {
        		tab.add(Echiquier.ech.gcase(i+1,j-2));
        		
        }
        if (verification(Echiquier.ech.gcase(i+1,j+2)))
        {
        		tab.add(Echiquier.ech.gcase(i+1,j+2));
        		
        }
        if (verification(Echiquier.ech.gcase(i-1,j-2)))
        {
        		 tab.add(Echiquier.ech.gcase(i-1,j-2));
        		 
        }
        if (verification(Echiquier.ech.gcase(i-1,j+2)))
        {
        		tab.add(Echiquier.ech.gcase(i-1,j+2));
        		
        }
        return tab;
    }

}