public enum Couleur {
    noir ("Noir"),
    blanc ("Blanc");

    String couleur = "";

    Couleur(String couleur) {
        this.couleur=couleur;
    }

    public String toString() {
        return couleur;
    }

	public static Couleur parsecoul(String readLine) {
		if(readLine=="Blanc")
			return blanc;
		return noir;
	}

}
