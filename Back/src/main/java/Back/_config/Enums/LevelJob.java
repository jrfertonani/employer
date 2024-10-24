package Back._config.Enums;

import lombok.Getter;

@Getter
public enum LevelJob {
    // aqui são os enums
    JUNIOR(0,"JUNIOR"),
    PLENO(1,"PLENO"),
    SENIOR(2,"SENIOR");

    //aqui as instancias
    private final Integer codigo;
    private final String descricao;

    //aqui construtor
    LevelJob(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    //aqui um codigo para verificar se existe ou não de enum
    //se existir retorna ele se não retorna uma exceção (não necessario)
    public static LevelJob toEnum(Integer cod){
        if( cod == null){
            return null;
        }
        for(LevelJob x : LevelJob.values()){
            if(cod.equals(x.getCodigo())){
                return x;
            }
        }
        throw new IllegalArgumentException("Level job Invalid : " + cod);
    }

}

