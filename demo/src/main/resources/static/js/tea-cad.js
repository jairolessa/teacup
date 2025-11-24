document.addEventListener("DOMContentLoaded", function () {

    //CPF
    document.getElementById('cpf').addEventListener('input', function(e) {
        let value = e.target.value.replace(/\D/g, '');
        if (value.length > 11) value = value.slice(0, 11);

        if (value.length > 9) {
            value = value.replace(/^(\d{3})(\d{3})(\d{3})(\d{2}).*/, '$1.$2.$3-$4');
        } else if (value.length > 6) {
            value = value.replace(/^(\d{3})(\d{3})(\d{0,3}).*/, '$1.$2.$3');
        } else if (value.length > 3) {
            value = value.replace(/^(\d{3})(\d{0,3}).*/, '$1.$2');
        }

        e.target.value = value;
    });

    //TELEFONE
    document.getElementById('telefone').addEventListener('input', function(e) {
        let value = e.target.value.replace(/\D/g, '');
        if (value.length > 11) value = value.slice(0, 11);

        if (value.length > 10) {
            value = value.replace(/^(\d{2})(\d{5})(\d{4}).*/, '($1) $2-$3');
        } else if (value.length > 6) {
            value = value.replace(/^(\d{2})(\d{4,5})(\d{0,4}).*/, '($1) $2-$3');
        } else if (value.length > 2) {
            value = value.replace(/^(\d{2})(\d{0,5}).*/, '($1) $2');
        }

        e.target.value = value;
    });

//    const generos = [
//        { value: "MASCULINO", label: "Masculino" },
//        { value: "FEMININO", label: "Feminino" },
//        { value: "OUTRO", label: "Outro" },
//        { value: "NAO_INFORMADO", label: "Prefiro não informar" }
//    ];
//
//    const vinculos = [
//        { value: "GENITOR", label: "Genitor" },
//        { value: "CONUGE", label: "Cônjuge" },
//        { value: "FILHO", label: "Filho(a)" },
//        { value: "RESPONSAVEL_LEGAL", label: "Responsável Legal" },
//        { value: "OUTRO", label: "Outro" }
//    ];
//
//    const niveisSuporte = [
//        { value: "SUPORTE_LEVE", label: "Nível 1 (Suporte Leve)" },
//        { value: "SUPORTE_MODERADO", label: "Nível 2 (Suporte Moderado)" },
//        { value: "SUPOETE_SEVERO", label: "Nível 3 (Suporte Severo)" },
//        { value: "NÃO_INFORMADO", label: "Prefiro não responder" }
//    ];

//    function preencherSelect(selectId, options) {
//        const select = document.getElementById(selectId);
//        select.innerHTML = "<option value=''>Selecione uma opção...</option>";
//        options.forEach(opt => {
//            const option = document.createElement("option");
//            option.value = opt.value || opt.sigla;
//            option.textContent = opt.label || opt.nome;
//            select.appendChild(option);
//        });
//    }

//    preencherSelect("genero", generos);
//    preencherSelect("parentesco", vinculos);
//    preencherSelect("nivelSuporte", niveisSuporte);

});
