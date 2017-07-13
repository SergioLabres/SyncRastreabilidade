package br.com.viasoft.SyncRastreabilidade.data;

import br.com.viasoft.SyncRastreabilidade.entity.Cliente;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by fabi on 13/07/17.
 */
public interface ClienteData extends ElasticsearchRepository<Cliente, String> {

}
