package carraro.diego.uno.conceitosclassesabstrataseinterfaces.formas;

// Java - Guia do Programador - 3ª Edição https: //github.com/pjandl/jgp3

public abstract class Forma {
    private double medida[];

    // Construtor parametrizado
    public Forma(int numMedidas) {
        medida = new double[numMedidas]; // aloca array de medidas
    }

    // Metodos
    public double getMedida(int i) { // obtem uma medida
        if (i < 0 || i >= medida.length) {
            throw new RuntimeException("Numero invalido de medida.");
        }
        return medida[i];
    }

    public int getNumMedidas() { // retorna numero de medidas
        return medida.length;
    }

    protected void setMedida(int i, double m) { // ajusta uma medida
        if (i < 0 || i >= medida.length) {
            throw new RuntimeException("Numero invalido de medida.");
        }
        if (m < 0) {
            throw new RuntimeException("Medida #" + i + "invalida.");
        }
        medida[i] = m;
    }

    @Override
    public String toString() { // representacão textual
        StringBuffer sb = new StringBuffer(getClass().getName());
        sb.append("[medidas:");
        for (int i = 0; i < medida.length - 1; i++) {
            sb.append(medida[i]);
            sb.append(",");
        }
        sb.append(medida[medida.length - 1]);
        sb.append("]");
        return sb.toString();
    }

    // metodo abstrato que determinara área e sempre será public.
    public abstract double area();
}


