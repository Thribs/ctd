/**
 * Imagine uma instituição que adota cachorros, e para a adoção é obrigatório que os cachorros registrados no sistema possuam informações como: está apto ou não para a adoção, raça, ano aproximado de nascimento, peso, possuem chip ou não, estejam feridos ou não e atribuído o primeiro nome para eles na instituição.
Precisaremos saber a idade do cachorro e validar se ele possui um chip para localização. 
Um cachorro pode ser encaminhado para adoção se não estiver ferido e pesar mais de 5 kg.

 */
import java.time.Year;

public class Dog {
    private String name;
    private Double weight;
    private String breed;
    private Year birthDate;
    private Boolean hasTag;
    private Boolean isVaccinated = false;
    private Boolean isNeutered = false;
    private Boolean isUpForAdoption;

    public Dog(
        String name,
        Double weight,
        String breed,
        Year birthDate,
        Boolean hasTag,
        Boolean isUpForAdoption
    )
    public int getAge() {
        private Year currentYear = Year.now();
        return currentYear
    }
}