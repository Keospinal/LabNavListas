package co.edu.unipiloto.labnavlistas;

public class TipoCarnes {

    private String name;
    private String description;
    private int imageResourceId;
    // declarar un arrreglo de las carnes
    public static final TipoCarnes[] CernesRe = {
            new TipoCarnes("Tripa", "Parte del aparato digestivo que se extiende del estómago hasta el ano de la res. Recibe dos nombres diferentes:",R.drawable.tripa) ,
            new TipoCarnes("Lengua", "La lengua de res es parte de la boca de la vaca",R.drawable.lengua) ,
            new TipoCarnes("Lomo", "El lomo es un corte de carne de la región dorsal de los animales de matadero.",R.drawable.lomores),
            new TipoCarnes("Centro de Cadera", "Conforma la cadera del novillo junto a la colita de cuadril y la tapa de cadera",R.drawable.centrocadera)
    };

    public static final TipoCarnes[] CernesCerdo = {
            new TipoCarnes("Tocino", "Parte del aparato digestivo que se extiende del estómago hasta el ano de la res. Recibe dos nombres diferentes:",R.drawable.tripa) ,
            new TipoCarnes("Jamon", "La lengua de res es parte de la boca de la vaca",R.drawable.lengua) ,
    };


    public static final TipoCarnes[] CernesPollo = {
            new TipoCarnes("Pierna", "Parte del aparato digestivo que se extiende del estómago hasta el ano de la res. Recibe dos nombres diferentes:",R.drawable.tripa) ,
            new TipoCarnes("Pechuga", "La lengua de res es parte de la boca de la vaca",R.drawable.lengua) ,
            new TipoCarnes("Ala", "El lomo es un corte de carne de la región dorsal de los animales de matadero.",R.drawable.lomores),
            new TipoCarnes("Muslo de Cadera", "Conforma la cadera del novillo junto a la colita de cuadril y la tapa de cadera",R.drawable.centrocadera)
    };

    //Constructor con los atributos
    public TipoCarnes(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public TipoCarnes() {
        this.name = "";
        this.description = "";
        this.imageResourceId = 0;
    }

    //Metodos get y set
    public String getName() {    return name;}
    public void setName(String name) {    this.name = name;}
    public String getDescription() {    return description;}
    public void setDescription(String description) {    this.description = description;}
    public int getImageResourceId() {    return imageResourceId;}
    public void setImageResourceId(int imageResourceId) {    this.imageResourceId = imageResourceId;}

    @Override
    public String toString() {    return            name;}
}
