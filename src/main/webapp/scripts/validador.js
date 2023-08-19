/**
 * Validação de formulário
 * @author Arthur Gomes de Oliveira
 */

 function validar() {
	let nome = frmVeiculo.nome.value
	let marca = frmVeiculo.marca.value
	if (nome === "") {
		alert('Preencha o campo Nome')
		frmVeiculo.nome.focus()
		return false
	} else if (marca === "") {
		alert('Preencha o campo Marca')
		frmVeiculo.marca.focus()
		return false
	} else {
		document.forms["frmVeiculo"].submit()
		alert('Cadastrado com sucesso!')
	}
 }