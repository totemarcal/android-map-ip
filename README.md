# android-map-ip

## Requisitos: 

O aplicativo deve exibir a localização atual do usuário no mapa. 

Deve se obter o módulo GPS do Android a sua coordenada com sua data e hora (dd-mm-aaaa hh:mm:ss), e armazenada no storage do dispositivo. 

Deve obter o valor armazenado no storage e exibi-lo no mapa. 

Consultar a última localização coletada quando consultado em modo off-line (sem GPS e Internet).

Se o GPS não estiver disponível, o aplicativo deve solicitar a API IP para recuperar a localização
aproximada a ser armazenada e exibida no mapa.

Disponibiliza o recurso do tooltip no mapa, o qual exibirá a data e hora (no formato supracitado) que
foi obtido a coordenada GPS.

Permite a identificação quanto a origem do dado (módulo GPS ou API). 

Exibe no titulo da tela o Texto GPS (oriundo do módulo GPS do Android) ou IP quando a origem for pela API IP.

Mesmo estando em off-line a solução deve a visualização da última coordenada obtida.

Oferecer suporte a várias resoluções e tamanhos.

## Extra: 
Exibe 5 localizações possíveis próxima à latitude e longitude do GPS.

Pode-se marcar até as 5 localizações possíveis no mapa.

Exibe a posição atual do GPS no mapa.

## Imagens: 
<img src="https://github.com/totemarcal/android-map-ip/blob/main/screenshot/localizacaoAPI.jpeg" width="180" height="350"/>
<img src="https://github.com/totemarcal/android-map-ip/blob/main/screenshot/permissaogps.jpeg" width="180" height="50"/>
<img src="https://github.com/totemarcal/android-map-ip/blob/main/screenshot/opcoesmenu.jpeg" width="180" height="50"/>
<img src="https://github.com/totemarcal/android-map-ip/blob/main/screenshot/opcoeslocalizacao.jpeg" width="180" height="50"/>
<img src="https://github.com/totemarcal/android-map-ip/blob/main/screenshot/marcarcaoLocalizacao.jpeg" width="180" height="50"/>



## Load: 
Ao corregar o app aparece uma mensagem com as opções de habilitar ou não habilitar o GPS. Ao clicar na opção de habilitar é carregado a possição atual do dispositivo móvel no mapa e move a camera do mapa para a posição.    

## Get place:
No clique desta opção de menu será exibido uma lista de 5 possíveis lugares baseado na posição do GPS. No clique de uma das 5 opções é feita uma marcação no mapa exibindo os dado no lugar (clique na marcação para exibir e esconder os dados). Cada lugar novo clicado é adicionado no mapa.

Se por acaso o GPS não foi habilitado anteriormente é exibida novamente a opção. 

Ao carregar os dados das 5 localizações eles são armazenado em SharedPreferences. Para poder exibir as informações nas marcações os dados são consultados na SharedPreferences.

## Get place (Offline): 
É feita uma consulta em SharedPreferences da última localização consultada e posteriormente é cerragado no mapa.

## Get place (IP): 
No clique desta opção é feita uma consulta a uma api (http://ip-api.com/json/192.168.0.4) informando o endereço ip do dispositivo móvel retornando uma localiação aproximada. Para consultar a API utilizei a biblioteca Retrofit.

## GPS: 
Caso o usuário não tenha habilitado o GPS no início do carregamento do app tem a opção de fazer por essa opção.
