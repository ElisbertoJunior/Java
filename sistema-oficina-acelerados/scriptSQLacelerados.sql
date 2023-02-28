
use dbacelerados;
describe tbos;

select
OSER.os,data_os,tipo,situacao,carro_modelo,ano_modelo,placa,valor,
CLI.nomecli,fone
from tbos as OSER
inner join tbclientes as CLI
on (CLI.idcli = OSER.idcli);

SELECT O.os, O.data_os, O.tipo, O.situacao, O.defeito, O.servico, O.carro_modelo, O.placa, O.ano_modelo, O.mecanico, O.valor
FROM tbos AS O
INNER JOIN tbclientes AS C
ON O.idcli = C.idcli
WHERE C.idcli = 2;