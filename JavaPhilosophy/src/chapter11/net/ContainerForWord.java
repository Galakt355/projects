package net;

public class ContainerForWord{
    private String name;
    public Integer numberOfRepetitions;

    public ContainerForWord(String _name){
        setName(_name);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String _name)
    {
        name = _name;
    }

    public Integer getnumberOfRepetitions()
    {
        return numberOfRepetitions;
    }

    public void setNumberOfRepetitions(Integer _numberOfRepetitions)
    {
        numberOfRepetitions = _numberOfRepetitions;
    }

    @Override
    public String toString(){
        return name;
    }
}