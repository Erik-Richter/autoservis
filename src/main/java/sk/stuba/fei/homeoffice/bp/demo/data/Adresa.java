package sk.stuba.fei.homeoffice.bp.demo.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Adresa {

    @NotEmpty
    @Size(min = 4)             // kvôli toString()
    private String psc;         // String: niektore PSC zacinaju 0
    @NotEmpty
    private String obec;
    @NotEmpty
    private String ulica;
    @NotEmpty
    private String cisloDomu;   // String: napr.: 27A, aby som vedel zapisat aj vlastnu korespondencnu adresu ;)

    @Override
    public String toString() {
        return ulica + " " + cisloDomu + ", " + obec + " " + psc.trim().substring(0,3) + " " + psc.trim().substring(3);
    }
}