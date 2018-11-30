# Introduction
This file services as documentation for managing environment specific endpoint configurations to be used during deployment time. Rather than taking an approach of using environment specific .yml files and Spring's env implmentation, the operations team is handling the values in this document via replacement during the Bamboo deployment process.

# Endpoints

## app.endpoints.cue
Responsible for CUE Releate Services Fileupload and View Document , Genreate corresp.

| Environment | Endpoint |
| ------ | ------ |
| LOCAL |http://va10dwviss323.us.ad.wellpoint.com:81/CUEDEV_RESTServices |
| SANDBOX |http://va10dwviss323.us.ad.wellpoint.com:81/CUEDEV_RESTServices |
| DEV |  http://va10dwviss323.us.ad.wellpoint.com:81/CUEDEV_RESTServices |
| SIT | http://va10twviss352.us.ad.wellpoint.com:85/CUE_RESTServices_SIT|
| UAT | http://va10twviss352.us.ad.wellpoint.com:81/CUE_RESTServices_UAT |
| DEMO |http://va10twviss352.us.ad.wellpoint.com:81/CUE_RESTServices_UAT |
| PERF | http://va10twviss352.us.ad.wellpoint.com:81/CUE_RESTServices_UAT |
| TRAINING | http://va10twviss352.us.ad.wellpoint.com:81/CUE_RESTServices_UAT |
| PROD | http://va10pwviss353.us.ad.wellpoint.com:81/CUE_REST |

