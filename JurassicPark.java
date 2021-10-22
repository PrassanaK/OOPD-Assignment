//****************************************************************
//Author: Prassana Kamalakannan 
//Filename: JurassicPark.java
//DateModified: 29/10/2017
//****************************************************************
public class JurassicPark
{
    //CLASS FIELDS
    private Dinosaur dinosaur[][];
    private int count;
    private boolean constructed;

    public JurassicPark()
    {
        dinosaur = new Dinosaur[50][2];
        count = 0;
        constructed = false;
    }
 
    public JurassicPark(Dinosaur inDinosaur[][], int inCount, boolean inConstructed)
    {
        dinosaur = new Dinosaur[inDinosaur.length][inDinosaur.length];
        for (int ii = 0; ii < inDinosaur.length; ii++)
        {
            for (int jj = 0; jj < inDinosaur.length[0]; jj++)
            {
                dinosaur[ii][jj] = new Dinosaur(inDinosaur[ii][jj])
            }//ENDFOR
        }//ENDFOR
    }//END Alternate

    public JurassicPark(JurassicPark inJurassicPark)
    {
        dinosaur = inJurassicPark.getDinosaur();
        count = inJurassicPark.getCount();
        constructed = inJurassicPark.getConstructed();
    }//END Copy

    //MUTATORS
    public void setDinosaur(Dinosaur inDinosaur[][])
    {
        if (inDinosaur == null)
        {
            throw IllegalArgumentException("invalid dinosaur");
        }
        else
        {
            dinosaur = new Dinosaur[inDinosaur.length][inDinosaur.length[0]]
            for (int ii = 0; ii < inDinosaur.length; ii++)
            {
                for (int jj = 0; jj < inDinosaur.length[0]; jj++)
                {
                    dinosaur[ii][jj] = new Dinosaur(inDinosaur[ii][jj]);
                }//ENDFOR
            }//ENDFOR
        }//ENDFOR
    }//END setDinosaur

    public void setCount(int inCount)
    { 
        count = inCount;
    }//END setCount
  
    public void setConstructed(boolean inConstructed)
    {
        constructed = inConstructed; 
    }//END setConstructed

    //ACCESSORS
    public Dinosaur [][] getDinosaur()
    {
        Dinosaur [][] dinosaurCopy = new Dinosaur[dinosaur.length][dinosaur.length[0]];
        for (int ii=0; ii < dinosaur.length; ii++)
        {
            for(int jj = 0; jj < dinosaur.length[0]; jj++)
            {
                dinosaurCopy [ii][jj] = new Dinosaur(dinosaur[ii][jj]);
            }//ENDFOR
        }//ENDFOR
        return dinosaurCopy;
    }//END getDinosaur
 
    public int getCount()
    {
        return count;
    }//END getCount

    public boolean getConstructed()
    {
        return constructed;
    }//END getConstructed

    public boolean isEqual(Object inObj)
    {
        boolean isEqual = false;
        if (inObj instanceof JurassicPark) 
        {
            inJurassicPark = (JurassicPark)inObj;
            if (sameAs(dinosaur, inJurassicPark.getDinosaur()))
            {
                if (count == inJurassicPark.getCount)
                {
                    if(constructed = inJurassicPark.getConstructed)
                    {
                        isEqual = true;
                    }//ENDIF
                }//ENDIF
            }//ENDIF
        }//ENDIF
    }//END isEqual

    public String toString()
    {
        Dinosaur [][] dinosaur = new Dinosaur[dinosaur.length][dinosaur.length[0]]
        for (int ii = 0; ii < dinosaur.length; ii++)
        {
            for (int jj = 0; jj < dinosaur.length; jj++)
            {   
                String str = "Count:" + count + "Has JurassicPark been constructed? " + constructed + dinosaur[ii][jj];
            }//ENDFOR
        }//ENDFOR
        return Str;
    }//END toString
