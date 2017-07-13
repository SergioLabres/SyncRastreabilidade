package br.com.viasoft.SyncRastreabilidade.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by fabi on 12/07/17.
 */
@Data
@Document(indexName = "cliente", type = "cliente")
public class Cliente {

    @Id
    private String cliente;
    private String url;


}
