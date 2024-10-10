package com.ecr.sampe.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecr.sampe.model.EcrDTO;
import com.ecr.sampe.model.EcrModel;

@RestController
@RequestMapping("/rest")
public class EcrRestController {

	/*
	 * List<EcrModel> list = Arrays.asList(new EcrModel("123", "123456", "open",
	 * "AZPEO"), new EcrModel("12345", "343434", "close", "AZPEO_an"));
	 */
	List<EcrModel> list = new ArrayList();

	@Bean
	public void addEcrDetails() {
		EcrModel product = new EcrModel("1001224824", "C2/0/1/UB", 0, "UC2/0/1:UO", 2, 0);

		EcrModel product2 = new EcrModel("1001224825", "C2/0/1/U0", 0, "UC2/0/1:U1", 2, 0);
		EcrModel product3 = new EcrModel("1001224826", "C2/0/1/U1", 0, "UC2/0/1:U2", 2, 0);

		list.add(product);
		list.add(product2);
		list.add(product3);

	}

	@GetMapping("/GetEcrDetails")

	public List<EcrModel> getEcrDetails() {
		System.out.println(list);
		return list;
	}

	@PostMapping("/e")
	public void details(String r) {
		System.out.println(r);
	}

	@PostMapping("/GetEcrDetailsById")
	public ResponseEntity<String> getEcrDetailsById(@RequestBody EcrDTO dto) {

		System.out.println(dto.getCmtsId());
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCmtsId().equalsIgnoreCase(dto.getCmtsId())) {
				System.out.println(list.get(i));
				return new ResponseEntity<>("the details are " + list.get(i), HttpStatus.OK);

			}
		}
		return new ResponseEntity<>(dto.getCmtsId() + " is not there  in the list " + list, HttpStatus.BAD_REQUEST);

	}

	@PostMapping(value = "/AddEcrDetails", consumes = { "application/json" })
	public ResponseEntity<String> save(@RequestBody EcrModel p) {
		System.out.println("recevied product "+p);
		EcrModel product = new EcrModel();
		product.setCmtsId(p.getCmtsId());
		product.setCableModemOffline(p.getCableModemOffline());
		product.setDescription(p.getDescription());
		product.setInterfaceName(p.getInterfaceName());
		product.setRx(p.getRx());
		product.setTx(p.getTx());
		list.add(product);
		System.out.println(list);
		return new ResponseEntity<>("saved successfully" + " & recevied details are " + list, HttpStatus.OK);
	}

}