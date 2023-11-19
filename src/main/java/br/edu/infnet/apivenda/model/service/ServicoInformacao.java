package br.edu.infnet.apivenda.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apivenda.model.domain.Informacao;
import br.edu.infnet.apivenda.model.repository.InformacaoRepository;

@Service
public class ServicoInformacao {
	@Autowired
	private InformacaoRepository informacaoRepository;

	public List<Informacao> obterLista() {
		return (List<Informacao>) informacaoRepository.findAll();
	}

	public Informacao incluir(Informacao informacao) {
		return informacaoRepository.save(informacao);
	}

}
