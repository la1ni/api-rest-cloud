package dio.domain.model;


import javax.persistence.*;

// essa anotação torna possível que essa classe seja herdada por outras. (entretanto, a troca de versão do spring fez com que isso não fosse suportado, então deixando apenas para efeitos de conhecimento)
@MappedSuperclass
public abstract class BaseItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private String icon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
