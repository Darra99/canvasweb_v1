-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: canvasweb.mysql.database.azure.com    Database: canvas
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `benefits`
--

DROP TABLE IF EXISTS `benefits`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `benefits` (
  `id_benefits` int NOT NULL AUTO_INCREMENT,
  `description_benefits` varchar(255) NOT NULL,
  PRIMARY KEY (`id_benefits`),
  UNIQUE KEY `descriptionBenefits_UNIQUE` (`description_benefits`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `benefits`
--

LOCK TABLES `benefits` WRITE;
/*!40000 ALTER TABLE `benefits` DISABLE KEYS */;
INSERT INTO `benefits` VALUES (24,'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadddd');
/*!40000 ALTER TABLE `benefits` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `breakeven`
--

DROP TABLE IF EXISTS `breakeven`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `breakeven` (
  `id_breakeven` int NOT NULL AUTO_INCREMENT,
  `description_breakeven` varchar(255) NOT NULL,
  PRIMARY KEY (`id_breakeven`),
  UNIQUE KEY `breakevencol_UNIQUE` (`description_breakeven`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `breakeven`
--

LOCK TABLES `breakeven` WRITE;
/*!40000 ALTER TABLE `breakeven` DISABLE KEYS */;
INSERT INTO `breakeven` VALUES (2,'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasssssssssssssssss');
/*!40000 ALTER TABLE `breakeven` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `channels`
--

DROP TABLE IF EXISTS `channels`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `channels` (
  `id_channels` int NOT NULL AUTO_INCREMENT,
  `description_channels` varchar(255) NOT NULL,
  `id_channels_type` int NOT NULL,
  PRIMARY KEY (`id_channels`),
  UNIQUE KEY `channelscol_UNIQUE` (`description_channels`),
  KEY `fk_idchannels_type_idx` (`id_channels_type`),
  KEY `fk_channels_type_idx` (`id_channels_type`),
  CONSTRAINT `fk_channels_type` FOREIGN KEY (`id_channels_type`) REFERENCES `channels_type` (`id_channels_type`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `channels`
--

LOCK TABLES `channels` WRITE;
/*!40000 ALTER TABLE `channels` DISABLE KEYS */;
INSERT INTO `channels` VALUES (3,'Mercados tradicionales',2),(4,'Almacenes y comercios electrónicos.',1),(5,'Canales.',2),(6,'Mercados del pueblo.',1);
/*!40000 ALTER TABLE `channels` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `channels_type`
--

DROP TABLE IF EXISTS `channels_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `channels_type` (
  `id_channels_type` int NOT NULL AUTO_INCREMENT,
  `channels_type` varchar(45) NOT NULL,
  PRIMARY KEY (`id_channels_type`),
  UNIQUE KEY `channels_typecol_UNIQUE` (`channels_type`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `channels_type`
--

LOCK TABLES `channels_type` WRITE;
/*!40000 ALTER TABLE `channels_type` DISABLE KEYS */;
INSERT INTO `channels_type` VALUES (1,'Inbound'),(2,'Outbound');
/*!40000 ALTER TABLE `channels_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `costs`
--

DROP TABLE IF EXISTS `costs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `costs` (
  `id_costs` int NOT NULL AUTO_INCREMENT,
  `description_costs` varchar(255) NOT NULL,
  PRIMARY KEY (`id_costs`),
  UNIQUE KEY `Costscol_UNIQUE` (`description_costs`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `costs`
--

LOCK TABLES `costs` WRITE;
/*!40000 ALTER TABLE `costs` DISABLE KEYS */;
INSERT INTO `costs` VALUES (3,'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasssssssssssssssss');
/*!40000 ALTER TABLE `costs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `early_adopters`
--

DROP TABLE IF EXISTS `early_adopters`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `early_adopters` (
  `id_early_adopters` int NOT NULL AUTO_INCREMENT,
  `description_early_adopters` varchar(255) NOT NULL,
  PRIMARY KEY (`id_early_adopters`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `early_adopters`
--

LOCK TABLES `early_adopters` WRITE;
/*!40000 ALTER TABLE `early_adopters` DISABLE KEYS */;
INSERT INTO `early_adopters` VALUES (3,'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadddd');
/*!40000 ALTER TABLE `early_adopters` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `high_concept`
--

DROP TABLE IF EXISTS `high_concept`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `high_concept` (
  `id_high_concept` int NOT NULL AUTO_INCREMENT,
  `description_high_concept` varchar(255) NOT NULL,
  PRIMARY KEY (`id_high_concept`),
  UNIQUE KEY `High_Conceptcol_UNIQUE` (`description_high_concept`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `high_concept`
--

LOCK TABLES `high_concept` WRITE;
/*!40000 ALTER TABLE `high_concept` DISABLE KEYS */;
INSERT INTO `high_concept` VALUES (2,'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadddd');
/*!40000 ALTER TABLE `high_concept` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `how_solve_problem`
--

DROP TABLE IF EXISTS `how_solve_problem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `how_solve_problem` (
  `id_how_solve_problem` int NOT NULL AUTO_INCREMENT,
  `description_how_solve_problem` varchar(255) NOT NULL,
  PRIMARY KEY (`id_how_solve_problem`),
  UNIQUE KEY `How_Solve_Problemcol_UNIQUE` (`description_how_solve_problem`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `how_solve_problem`
--

LOCK TABLES `how_solve_problem` WRITE;
/*!40000 ALTER TABLE `how_solve_problem` DISABLE KEYS */;
INSERT INTO `how_solve_problem` VALUES (5,'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadddd');
/*!40000 ALTER TABLE `how_solve_problem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `income`
--

DROP TABLE IF EXISTS `income`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `income` (
  `id_income` int NOT NULL AUTO_INCREMENT,
  `description_income` varchar(255) NOT NULL,
  PRIMARY KEY (`id_income`),
  UNIQUE KEY `Incomecol_UNIQUE` (`description_income`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `income`
--

LOCK TABLES `income` WRITE;
/*!40000 ALTER TABLE `income` DISABLE KEYS */;
INSERT INTO `income` VALUES (4,'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasssssssssssssssss');
/*!40000 ALTER TABLE `income` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `metrics`
--

DROP TABLE IF EXISTS `metrics`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `metrics` (
  `id_metrics` int NOT NULL AUTO_INCREMENT,
  `description_metrics` varchar(255) NOT NULL,
  PRIMARY KEY (`id_metrics`),
  UNIQUE KEY `Metricscol_UNIQUE` (`description_metrics`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `metrics`
--

LOCK TABLES `metrics` WRITE;
/*!40000 ALTER TABLE `metrics` DISABLE KEYS */;
INSERT INTO `metrics` VALUES (3,'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadddd');
/*!40000 ALTER TABLE `metrics` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ods`
--

DROP TABLE IF EXISTS `ods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ods` (
  `id_ods` int NOT NULL AUTO_INCREMENT,
  `description_ods` varchar(255) NOT NULL,
  `img_ods` varchar(255) NOT NULL,
  PRIMARY KEY (`id_ods`),
  UNIQUE KEY `Odscol_UNIQUE` (`description_ods`),
  UNIQUE KEY `img_ods_UNIQUE` (`img_ods`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ods`
--

LOCK TABLES `ods` WRITE;
/*!40000 ALTER TABLE `ods` DISABLE KEYS */;
INSERT INTO `ods` VALUES (1,'1. Fin de la pobreza','https://www.un.org/sustainabledevelopment/es/wp-content/uploads/sites/3/2016/01/S_SDG_Icons-01-01.jpg'),(2,'2. Hambre cero','https://www.un.org/sustainabledevelopment/es/wp-content/uploads/sites/3/2016/01/S_SDG_Icons-01-02.jpg'),(3,'3. Salud y bienestar','http://www.un.org/sustainabledevelopment/es/wp-content/uploads/sites/3/2016/01/S_SDG_Icons-01-03.jpg'),(4,'4. Educación de calidad','http://www.un.org/sustainabledevelopment/es/wp-content/uploads/sites/3/2016/01/S_SDG_Icons-01-04.jpg'),(5,'5. Igualdad de género','http://www.un.org/sustainabledevelopment/es/wp-content/uploads/sites/3/2016/01/S_SDG_Icons-01-05.jpg'),(6,'6. Agua limpia y saneamiento','http://www.un.org/sustainabledevelopment/es/wp-content/uploads/sites/3/2016/01/S_SDG_Icons-01-06.jpg'),(7,'7. Energía asequible y no contaminante','http://www.un.org/sustainabledevelopment/es/wp-content/uploads/sites/3/2016/01/S_SDG_Icons-01-07.jpg'),(8,'8. Trabajo decente y crecimiento económico','http://www.un.org/sustainabledevelopment/es/wp-content/uploads/sites/3/2016/01/S_SDG_Icons-01-08.jpg'),(9,'9. Industria, inovación e infraestructura','https://www.un.org/sustainabledevelopment/wp-content/uploads/sites/3/2015/09/S_SDG_Icons-01-09.jpg'),(10,'10. Reducción de la desigualdades','https://www.un.org/sustainabledevelopment/wp-content/uploads/sites/3/2015/09/S_SDG_Icons-01-10-1.jpg'),(11,'11. Ciudades y comunidades sostenibles','http://www.un.org/sustainabledevelopment/es/wp-content/uploads/sites/3/2016/01/S_SDG_Icons-01-11.jpg'),(12,'12. Producción y consumo responsable','https://www.un.org/sustainabledevelopment/wp-content/uploads/sites/3/2015/09/S_SDG_Icons-01-12.jpg'),(13,'13. Acción por el clima','http://www.un.org/sustainabledevelopment/es/wp-content/uploads/sites/3/2016/01/S_SDG_Icons-01-13.jpg'),(14,'14. Vida submarina','http://www.un.org/sustainabledevelopment/es/wp-content/uploads/sites/3/2016/01/S_SDG_Icons-01-14.jpg'),(15,'15. Vida de ecosistemas terrestres','http://www.un.org/sustainabledevelopment/es/wp-content/uploads/sites/3/2016/01/S_SDG_Icons-01-15.jpg'),(16,'16. Paz, justicia e instituciones sólidas','http://www.un.org/sustainabledevelopment/es/wp-content/uploads/sites/3/2016/01/S_SDG_Icons-01-16.jpg'),(17,'17. Alianzas para lograr los objetivos','http://www.un.org/sustainabledevelopment/es/wp-content/uploads/sites/3/2016/01/S_SDG_Icons-01-17.jpg');
/*!40000 ALTER TABLE `ods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ods_save`
--

DROP TABLE IF EXISTS `ods_save`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ods_save` (
  `id_ods_save` int NOT NULL AUTO_INCREMENT,
  `ods_id` int NOT NULL,
  `ods_select_id` int NOT NULL,
  PRIMARY KEY (`id_ods_save`),
  KEY `ods_fk_idx` (`ods_id`),
  KEY `ods_select_fk_idx` (`ods_select_id`),
  CONSTRAINT `ods_fk` FOREIGN KEY (`ods_id`) REFERENCES `ods` (`id_ods`),
  CONSTRAINT `ods_select_fk` FOREIGN KEY (`ods_select_id`) REFERENCES `ods_select` (`idods_select`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ods_save`
--

LOCK TABLES `ods_save` WRITE;
/*!40000 ALTER TABLE `ods_save` DISABLE KEYS */;
INSERT INTO `ods_save` VALUES (2,1,1);
/*!40000 ALTER TABLE `ods_save` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ods_select`
--

DROP TABLE IF EXISTS `ods_select`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ods_select` (
  `idods_select` int NOT NULL AUTO_INCREMENT,
  `ods_select_description` varchar(700) NOT NULL,
  `id_ods` int NOT NULL,
  PRIMARY KEY (`idods_select`),
  UNIQUE KEY `ods_select_description_UNIQUE` (`ods_select_description`),
  KEY `id_ods_fk_idx` (`id_ods`),
  CONSTRAINT `id_ods` FOREIGN KEY (`id_ods`) REFERENCES `ods` (`id_ods`)
) ENGINE=InnoDB AUTO_INCREMENT=170 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ods_select`
--

LOCK TABLES `ods_select` WRITE;
/*!40000 ALTER TABLE `ods_select` DISABLE KEYS */;
INSERT INTO `ods_select` VALUES (1,'1.1  Para 2030, erradicar la pobreza extrema para todas las personas en el mundo, actualmente medida por un ingreso por persona inferior a 1,25 dólares al día.',1),(2,'1.2  Para 2030, reducir al menos a la mitad la proporción de hombres, mujeres y niños y niñas de todas las edades que viven en la pobreza en todas sus dimensiones con arreglo a las definiciones nacionales.',1),(3,'1.3   Poner en práctica a nivel nacional sistemas y medidas apropiadas de protección social para todos y, para 2030, lograr una amplia cobertura de los pobres y los más vulnerables.',1),(4,'1.4   Para 2030, garantizar que todos los hombres y mujeres, en particular los pobres y los más vulnerables, tengan los mismos derechos a los recursos económicos, así como acceso a los servicios básicos, la propiedad y el control de las tierras y otros bienes, la herencia, los recursos naturales, las nuevas tecnologías y los servicios económicos, incluida la microfinanciación.',1),(5,'1.5   Para 2030, fomentar la resiliencia de los pobres y las personas que se encuentran en situaciones vulnerables y reducir su exposición y vulnerabilidad a los fenómenos extremos relacionados con el clima y a otros desastres económicos, sociales y ambientales.',1),(6,'1.a   Garantizar una movilización importante de recursos procedentes de diversas fuentes, incluso mediante la mejora de la cooperación para el desarrollo, a fin de proporcionar medios suficientes y previsibles para los países en desarrollo, en particular los países menos adelantados, para poner en práctica programas y políticas encaminados a poner fin a la pobreza en todas sus dimensiones.',1),(7,'1.b   Crear marcos normativos sólidos en el ámbito nacional, regional e internacional, sobre la base de estrategias de desarrollo en favor de los pobres que tengan en cuenta las cuestiones de género, a fin de apoyar la inversión acelerada en medidas para erradicar la pobreza.',1),(8,'2.1  Para 2030, poner fin al hambre y asegurar el acceso de todas las personas, en particular los pobres y las personas en situaciones vulnerables, incluidos los lactantes, a una alimentación sana, nutritiva y suficiente durante todo el año',2),(9,'2.2  Para 2030, poner fin a todas las formas de malnutrición, incluso logrando, a más tardar en 2025, las metas convenidas internacionalmente sobre el retraso del crecimiento y la emaciación de los niños menores de 5 años, y abordar las necesidades de nutrición de las adolescentes, las mujeres embarazadas y lactantes y las personas de edad',2),(10,'2.3  Para 2030, duplicar la productividad agrícola y los ingresos de los productores de alimentos en pequeña escala, en particular las mujeres, los pueblos indígenas, los agricultores familiares, los pastores y los pescadores, entre otras cosas mediante un acceso seguro y equitativo a las tierras, a otros recursos de producción e insumos, conocimientos, servicios financieros, mercados y oportunidades para la generación de valor añadido y empleos no agrícolas',2),(11,'2.4  Para 2030, asegurar la sostenibilidad de los sistemas de producción de alimentos y aplicar prácticas agrícolas resilientes que aumenten la productividad y la producción, contribuyan al mantenimiento de los ecosistemas, fortalezcan la capacidad de adaptación al cambio climático, los fenómenos meteorológicos extremos, las sequías, las inundaciones y otros desastres, y mejoren progresivamente la calidad del suelo y la tierra',2),(12,'2.5  Para 2020, mantener la diversidad genética de las semillas, las plantas cultivadas y los animales de granja y domesticados y sus especies silvestres conexas, entre otras cosas mediante una buena gestión y diversificación de los bancos de semillas y plantas a nivel nacional, regional e internacional, y promover el acceso a los beneficios que se deriven de la utilización de los recursos genéticos y los conocimientos tradicionales y su distribución justa y equitativa, como se ha convenido internacionalmente',2),(13,'2.a  Aumentar las inversiones, incluso mediante una mayor cooperación internacional, en la infraestructura rural, la investigación agrícola y los servicios de extensión, el desarrollo tecnológico y los bancos de genes de plantas y ganado a fin de mejorar la capacidad de producción agrícola en los países en desarrollo, en particular en los países menos adelantados',2),(14,'2.b  Corregir y prevenir las restricciones y distorsiones comerciales en los mercados agropecuarios mundiales, entre otras cosas mediante la eliminación paralela de todas las formas de subvenciones a las exportaciones agrícolas y todas las medidas de exportación con efectos equivalentes, de conformidad con el mandato de la Ronda de Doha para el Desarrollo',2),(15,'2.c  Adoptar medidas para asegurar el buen funcionamiento de los mercados de productos básicos alimentarios y sus derivados y facilitar el acceso oportuno a información sobre los mercados, en particular sobre las reservas de alimentos, a fin de ayudar a limitar la extrema volatilidad de los precios de los alimentos',2),(16,'3.1  Para 2030, reducir la tasa mundial de mortalidad materna a menos de 70 por cada 100.000 nacidos vivos',3),(17,'3.2  Para 2030, poner fin a las muertes evitables de recién nacidos y de niños menores de 5 años, logrando que todos los países intenten reducir la mortalidad neonatal al menos hasta 12 por cada 1.000 nacidos vivos, y la mortalidad de niños menores de 5 años al menos hasta 25 por cada 1.000 nacidos vivos',3),(18,'3.3  Para 2030, poner fin a las epidemias del SIDA, la tuberculosis, la malaria y las enfermedades tropicales desatendidas y combatir la hepatitis, las enfermedades transmitidas por el agua y otras enfermedades transmisibles',3),(19,'3.4  Para 2030, reducir en un tercio la mortalidad prematura por enfermedades no transmisibles mediante la prevención y el tratamiento y promover la salud mental y el bienestar',3),(20,'3.5  Fortalecer la prevención y el tratamiento del abuso de sustancias adictivas, incluido el uso indebido de estupefacientes y el consumo nocivo de alcohol',3),(21,'3.6  Para 2020, reducir a la mitad el número de muertes y lesiones causadas por accidentes de tráfico en el mundo',3),(22,'3.7  Para 2030, garantizar el acceso universal a los servicios de salud sexual y reproductiva, incluidos los de planificación de la familia, información y educación, y la integración de la salud reproductiva en las estrategias y los programas nacionales',3),(23,'3.8  Lograr la cobertura sanitaria universal, en particular la protección contra los riesgos financieros, el acceso a servicios de salud esenciales de calidad y el acceso a medicamentos y vacunas seguros, eficaces, asequibles y de calidad para todos',3),(24,'3.9  Para 2030, reducir sustancialmente el número de muertes y enfermedades producidas por productos químicos peligrosos y la contaminación del aire, el agua y el suelo',3),(25,'3.a  Fortalecer la aplicación del Convenio Marco de la Organización Mundial de la Salud para el Control del Tabaco en todos los países, según proceda',3),(26,'3.b  Apoyar las actividades de investigación y desarrollo de vacunas y medicamentos para las enfermedades transmisibles y no transmisibles que afectan primordialmente a los países en desarrollo y facilitar el acceso a medicamentos y vacunas esenciales asequibles de conformidad con la Declaración de Doha relativa al Acuerdo sobre los ADPIC y la Salud Pública, en la que se afirma el derecho de los países en desarrollo a utilizar al máximo las disposiciones del Acuerdo sobre los Aspectos de los Derechos de Propiedad Intelectual Relacionados con el Comercio en lo relativo a la flexibilidad para proteger la salud pública y, en particular, proporcionar acceso a los medicamentos para todos',3),(27,'3.c  Aumentar sustancialmente la financiación de la salud y la contratación, el desarrollo, la capacitación y la retención del personal sanitario en los países en desarrollo, especialmente en los países menos adelantados y los pequeños Estados insulares en desarrollo',3),(28,'3.d  Reforzar la capacidad de todos los países, en particular los países en desarrollo, en materia de alerta temprana, reducción de riesgos y gestión de los riesgos para la salud nacional y mundial',3),(29,'4.1  De aquí a 2030, asegurar que todas las niñas y todos los niños terminen la enseñanza primaria y secundaria, que ha de ser gratuita, equitativa y de calidad y producir resultados de aprendizaje pertinentes y efectivos',4),(30,'4.2  De aquí a 2030, asegurar que todas las niñas y todos los niños tengan acceso a servicios de atención y desarrollo en la primera infancia y educación preescolar de calidad, a fin de que estén preparados para la enseñanza primaria',4),(31,'4.3  De aquí a 2030, asegurar el acceso igualitario de todos los hombres y las mujeres a una formación técnica, profesional y superior de calidad, incluida la enseñanza universitaria',4),(32,'4.4  De aquí a 2030, aumentar considerablemente el número de jóvenes y adultos que tienen las competencias necesarias, en particular técnicas y profesionales, para acceder al empleo, el trabajo decente y el emprendimiento',4),(33,'4.5  De aquí a 2030, eliminar las disparidades de género en la educación y asegurar el acceso igualitario a todos los niveles de la enseñanza y la formación profesional para las personas vulnerables, incluidas las personas con discapacidad, los pueblos indígenas y los niños en situaciones de vulnerabilidad',4),(34,'4.6  De aquí a 2030, asegurar que todos los jóvenes y una proporción considerable de los adultos, tanto hombres como mujeres, estén alfabetizados y tengan nociones elementales de aritmética',4),(35,'4.7  De aquí a 2030, asegurar que todos los alumnos adquieran los conocimientos teóricos y prácticos necesarios para promover el desarrollo sostenible, entre otras cosas mediante la educación para el desarrollo sostenible y los estilos de vida sostenibles, los derechos humanos, la igualdad de género, la promoción de una cultura de paz y no violencia, la ciudadanía mundial y la valoración de la diversidad cultural y la contribución de la cultura al desarrollo sostenible',4),(36,'4.a  Construir y adecuar instalaciones educativas que tengan en cuenta las necesidades de los niños y las personas con discapacidad y las diferencias de género, y que ofrezcan entornos de aprendizaje seguros, no violentos, inclusivos y eficaces para todos',4),(37,'4.b  De aquí a 2020, aumentar considerablemente a nivel mundial el número de becas disponibles para los países en desarrollo, en particular los países menos adelantados, los pequeños Estados insulares en desarrollo y los países africanos, a fin de que sus estudiantes puedan matricularse en programas de enseñanza superior, incluidos programas de formación profesional y programas técnicos, científicos, de ingeniería y de tecnología de la información y las comunicaciones, de países desarrollados y otros países en desarrollo',4),(38,'4.c  De aquí a 2030, aumentar considerablemente la oferta de docentes calificados, incluso mediante la cooperación internacional para la formación de docentes en los países en desarrollo, especialmente los países menos adelantados y los pequeños Estados insulares en desarrollo',4),(39,'5.1  Poner fin a todas las formas de discriminación contra todas las mujeres y las niñas en todo el mundo',5),(40,'5.2  Eliminar todas las formas de violencia contra todas las mujeres y las niñas en los ámbitos público y privado, incluidas la trata y la explotación sexual y otros tipos de explotación',5),(41,'5.3  Eliminar todas las prácticas nocivas, como el matrimonio infantil, precoz y forzado y la mutilación genital femenina',5),(42,'5.4  Reconocer y valorar los cuidados y el trabajo doméstico no remunerados mediante servicios públicos, infraestructuras y políticas de protección social, y promoviendo la responsabilidad compartida en el hogar y la familia, según proceda en cada país',5),(43,'5.5  Asegurar la participación plena y efectiva de las mujeres y la igualdad de oportunidades de liderazgo a todos los niveles decisorios en la vida política, económica y pública',5),(44,'5.6  Asegurar el acceso universal a la salud sexual y reproductiva y los derechos reproductivos según lo acordado de conformidad con el Programa de Acción de la Conferencia Internacional sobre la Población y el Desarrollo, la Plataforma de Acción de Beijing y los documentos finales de sus conferencias de examen',5),(45,'5.a  Emprender reformas que otorguen a las mujeres igualdad de derechos a los recursos económicos, así como acceso a la propiedad y al control de la tierra y otros tipos de bienes, los servicios financieros, la herencia y los recursos naturales, de conformidad con las leyes nacionales',5),(46,'5.b  Mejorar el uso de la tecnología instrumental, en particular la tecnología de la información y las comunicaciones, para promover el empoderamiento de las mujeres',5),(47,'5.c  Aprobar y fortalecer políticas acertadas y leyes aplicables para promover la igualdad de género y el empoderamiento de todas las mujeres y las niñas a todos los niveles',5),(48,'6.1  De aquí a 2030, lograr el acceso universal y equitativo al agua potable a un precio asequible para todos',6),(49,'6.2  De aquí a 2030, lograr el acceso a servicios de saneamiento e higiene adecuados y equitativos para todos y poner fin a la defecación al aire libre, prestando especial atención a las necesidades de las mujeres y las niñas y las personas en situaciones de vulnerabilidad',6),(50,'6.3  De aquí a 2030, mejorar la calidad del agua reduciendo la contaminación, eliminando el vertimiento y minimizando la emisión de productos químicos y materiales peligrosos, reduciendo a la mitad el porcentaje de aguas residuales sin tratar y aumentando considerablemente el reciclado y la reutilización sin riesgos a nivel mundial',6),(51,'6.4  De aquí a 2030, aumentar considerablemente el uso eficiente de los recursos hídricos en todos los sectores y asegurar la sostenibilidad de la extracción y el abastecimiento de agua dulce para hacer frente a la escasez de agua y reducir considerablemente el número de personas que sufren falta de agua',6),(52,'6.5  De aquí a 2030, implementar la gestión integrada de los recursos hídricos a todos los niveles, incluso mediante la cooperación transfronteriza, según proceda',6),(53,'6.6  De aquí a 2020, proteger y restablecer los ecosistemas relacionados con el agua, incluidos los bosques, las montañas, los humedales, los ríos, los acuíferos y los lagos',6),(54,'6.a  De aquí a 2030, ampliar la cooperación internacional y el apoyo prestado a los países en desarrollo para la creación de capacidad en actividades y programas relativos al agua y el saneamiento, como los de captación de agua, desalinización, uso eficiente de los recursos hídricos, tratamiento de aguas residuales, reciclado y tecnologías de reutilización',6),(55,'6.b  Apoyar y fortalecer la participación de las comunidades locales en la mejora de la gestión del agua y el saneamiento',6),(56,'7.1  De aquí a 2030, garantizar el acceso universal a servicios energéticos asequibles, fiables y modernos',7),(57,'7.2  De aquí a 2030, aumentar considerablemente la proporción de energía renovable en el conjunto de fuentes energéticas',7),(58,'7.3  De aquí a 2030, duplicar la tasa mundial de mejora de la eficiencia energética',7),(59,'7.a  De aquí a 2030, aumentar la cooperación internacional para facilitar el acceso a la investigación y la tecnología relativas a la energía limpia, incluidas las fuentes renovables, la eficiencia energética y las tecnologías avanzadas y menos contaminantes de combustibles fósiles, y promover la inversión en infraestructura energética y tecnologías limpias',7),(60,'7.b  De aquí a 2030, ampliar la infraestructura y mejorar la tecnología para prestar servicios energéticos modernos y sostenibles para todos en los países en desarrollo, en particular los países menos adelantados, los pequeños Estados insulares en desarrollo y los países en desarrollo sin litoral, en consonancia con sus respectivos programas de apoyo',7),(61,'8.1  Mantener el crecimiento económico per capita de conformidad con las circunstancias nacionales y, en particular, un crecimiento del producto interno bruto de al menos el 7% anual en los países menos adelantados',8),(62,'8.2  Lograr niveles más elevados de productividad económica mediante la diversificación, la modernización tecnológica y la innovación, entre otras cosas centrándose en los sectores con gran valor añadido y un uso intensivo de la mano de obra',8),(63,'8.3  Promover políticas orientadas al desarrollo que apoyen las actividades productivas, la creación de puestos de trabajo decentes, el emprendimiento, la creatividad y la innovación, y fomentar la formalización y el crecimiento de las microempresas y las pequeñas y medianas empresas, incluso mediante el acceso a servicios financieros',8),(64,'8.4 Mejorar progresivamente, de aquí a 2030, la producción y el consumo eficientes de los recursos mundiales y procurar desvincular el crecimiento económico de la degradación del medio ambiente, conforme al Marco Decenal de Programas sobre modalidades de Consumo y Producción Sostenibles, empezando por los países desarrollados',8),(65,'8.5  De aquí a 2030, lograr el empleo pleno y productivo y el trabajo decente para todas las mujeres y los hombres, incluidos los jóvenes y las personas con discapacidad, así como la igualdad de remuneración por trabajo de igual valor',8),(66,'8.6  De aquí a 2020, reducir considerablemente la proporción de jóvenes que no están empleados y no cursan estudios ni reciben capacitación',8),(67,'8.7  Adoptar medidas inmediatas y eficaces para erradicar el trabajo forzoso, poner fin a las formas contemporáneas de esclavitud y la trata de personas y asegurar la prohibición y eliminación de las peores formas de trabajo infantil, incluidos el reclutamiento y la utilización de niños soldados, y, de aquí a 2025, poner fin al trabajo infantil en todas sus formas',8),(68,'8.8  Proteger los derechos laborales y promover un entorno de trabajo seguro y sin riesgos para todos los trabajadores, incluidos los trabajadores migrantes, en particular las mujeres migrantes y las personas con empleos precarios',8),(69,'8.9  De aquí a 2030, elaborar y poner en práctica políticas encaminadas a promover un turismo sostenible que cree puestos de trabajo y promueva la cultura y los productos locales',8),(70,'8.10  Fortalecer la capacidad de las instituciones financieras nacionales para fomentar y ampliar el acceso a los servicios bancarios, financieros y de seguros para todos',8),(71,'8.a  Aumentar el apoyo a la iniciativa de ayuda para el comercio en los países en desarrollo, en particular los países menos adelantados, incluso mediante el Marco Integrado Mejorado para la Asistencia Técnica a los Países Menos Adelantados en Materia de Comercio',8),(72,'8.b  De aquí a 2020, desarrollar y poner en marcha una estrategia mundial para el empleo de los jóvenes y aplicar el Pacto Mundial para el Empleo de la Organización Internacional del Trabajo',8),(73,'9.1 Desarrollar infraestructuras fiables, sostenibles, resilientes y de calidad, incluidas infraestructuras regionales y transfronterizas, para apoyar el desarrollo económico y el bienestar humano, haciendo especial hincapié en el acceso asequible y equitativo para todos',9),(74,'9.2 Promover una industrialización inclusiva y sostenible y, de aquí a 2030, aumentar significativamente la contribución de la industria al empleo y al producto interno bruto, de acuerdo con las circunstancias nacionales, y duplicar esa contribución en los países menos adelantados',9),(75,'9.3 Aumentar el acceso de las pequeñas industrias y otras empresas, particularmente en los países en desarrollo, a los servicios financieros, incluidos créditos asequibles, y su integración en las cadenas de valor y los mercados',9),(76,'9.4 De aquí a 2030, modernizar la infraestructura y reconvertir las industrias para que sean sostenibles, utilizando los recursos con mayor eficacia y promoviendo la adopción de tecnologías y procesos industriales limpios y ambientalmente racionales, y logrando que todos los países tomen medidas de acuerdo con sus capacidades respectivas',9),(77,'9.5 Aumentar la investigación científica y mejorar la capacidad tecnológica de los sectores industriales de todos los países, en particular los países en desarrollo, entre otras cosas fomentando la innovación y aumentando considerablemente, de aquí a 2030, el número de personas que trabajan en investigación y desarrollo por millón de habitantes y los gastos de los sectores público y privado en investigación y desarrollo',9),(78,'9.a Facilitar el desarrollo de infraestructuras sostenibles y resilientes en los países en desarrollo mediante un mayor apoyo financiero, tecnológico y técnico a los países africanos, los países menos adelantados, los países en desarrollo sin litoral y los pequeños Estados insulares en desarrollo',9),(79,'9.b Apoyar el desarrollo de tecnologías, la investigación y la innovación nacionales en los países en desarrollo, incluso garantizando un entorno normativo propicio a la diversificación industrial y la adición de valor a los productos básicos, entre otras cosas',9),(80,'9.c Aumentar significativamente el acceso a la tecnología de la información y las comunicaciones y esforzarse por proporcionar acceso universal y asequible a Internet en los países menos adelantados de aquí a 2020',9),(81,'10.1 De aquí a 2030, lograr progresivamente y mantener el crecimiento de los ingresos del 40% más pobre de la población a una tasa superior a la media nacional',10),(82,'10.2 De aquí a 2030, potenciar y promover la inclusión social, económica y política de todas las personas, independientemente de su edad, sexo, discapacidad, raza, etnia, origen, religión o situación económica u otra condición',10),(83,'10.3 Garantizar la igualdad de oportunidades y reducir la desigualdad de resultados, incluso eliminando las leyes, políticas y prácticas discriminatorias y promoviendo legislaciones, políticas y medidas adecuadas a ese respecto',10),(84,'10.4 Adoptar políticas, especialmente fiscales, salariales y de protección social, y lograr progresivamente una mayor igualdad',10),(85,'10.5 Mejorar la reglamentación y vigilancia de las instituciones y los mercados financieros mundiales y fortalecer la aplicación de esos reglamentos',10),(86,'10.6 Asegurar una mayor representación e intervención de los países en desarrollo en las decisiones adoptadas por las instituciones económicas y financieras internacionales para aumentar la eficacia, fiabilidad, rendición de cuentas y legitimidad de esas instituciones',10),(87,'10.7 Facilitar la migración y la movilidad ordenadas, seguras, regulares y responsables de las personas, incluso mediante la aplicación de políticas migratorias planificadas y bien gestionadas',10),(88,'10.a Aplicar el principio del trato especial y diferenciado para los países en desarrollo, en particular los países menos adelantados, de conformidad con los acuerdos de la Organización Mundial del Comercio',10),(89,'10.b Fomentar la asistencia oficial para el desarrollo y las corrientes financieras, incluida la inversión extranjera directa, para los Estados con mayores necesidades, en particular los países menos adelantados, los países africanos, los pequeños Estados insulares en desarrollo y los países en desarrollo sin litoral, en consonancia con sus planes y programas nacionales',10),(90,'10.c De aquí a 2030, reducir a menos del 3% los costos de transacción de las remesas de los migrantes y eliminar los corredores de remesas con un costo superior al 5%',10),(91,'11.1 De aquí a 2030, asegurar el acceso de todas las personas a viviendas y servicios básicos adecuados, seguros y asequibles y mejorar los barrios marginales',11),(92,'11.2 De aquí a 2030, proporcionar acceso a sistemas de transporte seguros, asequibles, accesibles y sostenibles para todos y mejorar la seguridad vial, en particular mediante la ampliación del transporte público, prestando especial atención a las necesidades de las personas en situación de vulnerabilidad, las mujeres, los niños, las personas con discapacidad y las personas de edad',11),(93,'11.3 De aquí a 2030, aumentar la urbanización inclusiva y sostenible y la capacidad para la planificación y la gestión participativas, integradas y sostenibles de los asentamientos humanos en todos los países',11),(94,'11.4 Redoblar los esfuerzos para proteger y salvaguardar el patrimonio cultural y natural del mundo',11),(95,'11.5 De aquí a 2030, reducir significativamente el número de muertes causadas por los desastres, incluidos los relacionados con el agua, y de personas afectadas por ellos, y reducir considerablemente las pérdidas económicas directas provocadas por los desastres en comparación con el producto interno bruto mundial, haciendo especial hincapié en la protección de los pobres y las personas en situaciones de vulnerabilidad',11),(96,'11.6 De aquí a 2030, reducir el impacto ambiental negativo per capita de las ciudades, incluso prestando especial atención a la calidad del aire y la gestión de los desechos municipales y de otro tipo',11),(97,'11.7 De aquí a 2030, proporcionar acceso universal a zonas verdes y espacios públicos seguros, inclusivos y accesibles, en particular para las mujeres y los niños, las personas de edad y las personas con discapacidad',11),(98,'11.a Apoyar los vínculos económicos, sociales y ambientales positivos entre las zonas urbanas, periurbanas y rurales fortaleciendo la planificación del desarrollo nacional y regional',11),(99,'11.b De aquí a 2020, aumentar considerablemente el número de ciudades y asentamientos humanos que adoptan e implementan políticas y planes integrados para promover la inclusión, el uso eficiente de los recursos, la mitigación del cambio climático y la adaptación a él y la resiliencia ante los desastres, y desarrollar y poner en práctica, en consonancia con el Marco de Sendai para la Reducción del Riesgo de Desastres 2015-2030, la gestión integral de los riesgos de desastre a todos los niveles',11),(100,'11.c Proporcionar apoyo a los países menos adelantados, incluso mediante asistencia financiera y técnica, para que puedan construir edificios sostenibles y resilientes utilizando materiales locales',11),(101,'12.1 Aplicar el Marco Decenal de Programas sobre Modalidades de Consumo y Producción Sostenibles, con la participación de todos los países y bajo el liderazgo de los países desarrollados, teniendo en cuenta el grado de desarrollo y las capacidades de los países en desarrollo',12),(102,'12.2 De aquí a 2030, lograr la gestión sostenible y el uso eficiente de los recursos naturales',12),(103,'12.3 De aquí a 2030, reducir a la mitad el desperdicio de alimentos per capita mundial en la venta al por menor y a nivel de los consumidores y reducir las pérdidas de alimentos en las cadenas de producción y suministro, incluidas las pérdidas posteriores a la cosecha',12),(104,'12.4 De aquí a 2020, lograr la gestión ecológicamente racional de los productos químicos y de todos los desechos a lo largo de su ciclo de vida, de conformidad con los marcos internacionales convenidos, y reducir significativamente su liberación a la atmósfera, el agua y el suelo a fin de minimizar sus efectos adversos en la salud humana y el medio ambiente',12),(105,'12.5 De aquí a 2030, reducir considerablemente la generación de desechos mediante actividades de prevención, reducción, reciclado y reutilización',12),(106,'12.6 Alentar a las empresas, en especial las grandes empresas y las empresas transnacionales, a que adopten prácticas sostenibles e incorporen información sobre la sostenibilidad en su ciclo de presentación de informes',12),(107,'12.7 Promover prácticas de adquisición pública que sean sostenibles, de conformidad con las políticas y prioridades nacionales',12),(108,'12.8 De aquí a 2030, asegurar que las personas de todo el mundo tengan la información y los conocimientos pertinentes para el desarrollo sostenible y los estilos de vida en armonía con la naturaleza',12),(109,'12.a Ayudar a los países en desarrollo a fortalecer su capacidad científica y tecnológica para avanzar hacia modalidades de consumo y producción más sostenibles',12),(110,'12.b Elaborar y aplicar instrumentos para vigilar los efectos en el desarrollo sostenible, a fin de lograr un turismo sostenible que cree puestos de trabajo y promueva la cultura y los productos locales',12),(111,'12.c Racionalizar los subsidios ineficientes a los combustibles fósiles que fomentan el consumo antieconómico eliminando las distorsiones del mercado, de acuerdo con las circunstancias nacionales, incluso mediante la reestructuración de los sistemas tributarios y la eliminación gradual de los subsidios perjudiciales, cuando existan, para reflejar su impacto ambiental, teniendo plenamente en cuenta las necesidades y condiciones específicas de los países en desarrollo y minimizando los posibles efectos adversos en su desarrollo, de manera que se proteja a los pobres y a las comunidades afectadas',12),(112,'13.1 Fortalecer la resiliencia y la capacidad de adaptación a los riesgos relacionados con el clima y los desastres naturales en todos los países',13),(113,'13.2 Incorporar medidas relativas al cambio climático en las políticas, estrategias y planes nacionales',13),(114,'13.3 Mejorar la educación, la sensibilización y la capacidad humana e institucional respecto de la mitigación del cambio climático, la adaptación a él, la reducción de sus efectos y la alerta temprana',13),(115,'13.a Cumplir el compromiso de los países desarrollados que son partes en la Convención Marco de las Naciones Unidas sobre el Cambio Climático de lograr para el año 2020 el objetivo de movilizar conjuntamente 100.000 millones de dólares anuales procedentes de todas las fuentes a fin de atender las necesidades de los países en desarrollo respecto de la adopción de medidas concretas de mitigación y la transparencia de su aplicación, y poner en pleno funcionamiento el Fondo Verde para el Clima capitalizándolo lo antes posible',13),(116,'13.b Promover mecanismos para aumentar la capacidad para la planificación y gestión eficaces en relación con el cambio climático en los países menos adelantados y los pequeños Estados insulares en desarrollo, haciendo particular hincapié en las mujeres, los jóvenes y las comunidades locales y marginadas',13),(117,'14.1 De aquí a 2025, prevenir y reducir significativamente la contaminación marina de todo tipo, en particular la producida por actividades realizadas en tierra, incluidos los detritos marinos y la polución por nutrientes',14),(118,'14.2 De aquí a 2020, gestionar y proteger sosteniblemente los ecosistemas marinos y costeros para evitar efectos adversos importantes, incluso fortaleciendo su resiliencia, y adoptar medidas para restaurarlos a fin de restablecer la salud y la productividad de los océanos',14),(119,'14.3 Minimizar y abordar los efectos de la acidificación de los océanos, incluso mediante una mayor cooperación científica a todos los niveles',14),(120,'14.4 De aquí a 2020, reglamentar eficazmente la explotación pesquera y poner fin a la pesca excesiva, la pesca ilegal, no declarada y no reglamentada y las prácticas pesqueras destructivas, y aplicar planes de gestión con fundamento científico a fin de restablecer las poblaciones de peces en el plazo más breve posible, al menos alcanzando niveles que puedan producir el máximo rendimiento sostenible de acuerdo con sus características biológicas',14),(121,'14.5 De aquí a 2020, conservar al menos el 10% de las zonas costeras y marinas, de conformidad con las leyes nacionales y el derecho internacional y sobre la base de la mejor información científica disponible',14),(122,'14.6 De aquí a 2020, prohibir ciertas formas de subvenciones a la pesca que contribuyen a la sobrecapacidad y la pesca excesiva, eliminar las subvenciones que contribuyen a la pesca ilegal, no declarada y no reglamentada y abstenerse de introducir nuevas subvenciones de esa índole, reconociendo que la negociación sobre las subvenciones a la pesca en el marco de la Organización Mundial del Comercio debe incluir un trato especial y diferenciado, apropiado y efectivo para los países en desarrollo y los países menos adelantados',14),(123,'14.7 De aquí a 2030, aumentar los beneficios económicos que los pequeños Estados insulares en desarrollo y los países menos adelantados obtienen del uso sostenible de los recursos marinos, en particular mediante la gestión sostenible de la pesca, la acuicultura y el turismo',14),(124,'14.a Aumentar los conocimientos científicos, desarrollar la capacidad de investigación y transferir tecnología marina, teniendo en cuenta los Criterios y Directrices para la Transferencia de Tecnología Marina de la Comisión Oceanográfica Intergubernamental, a fin de mejorar la salud de los océanos y potenciar la contribución de la biodiversidad marina al desarrollo de los países en desarrollo, en particular los pequeños Estados insulares en desarrollo y los países menos adelantados',14),(125,'14.b Facilitar el acceso de los pescadores artesanales a los recursos marinos y los mercados',14),(126,'14.c Mejorar la conservación y el uso sostenible de los océanos y sus recursos aplicando el derecho internacional reflejado en la Convención de las Naciones Unidas sobre el Derecho del Mar, que constituye el marco jurídico para la conservación y la utilización sostenible de los océanos y sus recursos, como se recuerda en el párrafo 158 del documento “El futuro que queremos”',14),(127,'15.1 Para 2020, velar por la conservación, el restablecimiento y el uso sostenible de los ecosistemas terrestres y los ecosistemas interiores de agua dulce y los servicios que proporcionan, en particular los bosques, los humedales, las montañas y las zonas áridas, en consonancia con las obligaciones contraídas en virtud de acuerdos internacionales',15),(128,'15.2 Para 2020, promover la gestión sostenible de todos los tipos de bosques, poner fin a la deforestación, recuperar los bosques degradados e incrementar la forestación y la reforestación a nivel mundial',15),(129,'15.3 Para 2030, luchar contra la desertificación, rehabilitar las tierras y los suelos degradados, incluidas las tierras afectadas por la desertificación, la sequía y las inundaciones, y procurar lograr un mundo con una degradación neutra del suelo',15),(130,'15.4 Para 2030, velar por la conservación de los ecosistemas montañosos, incluida su diversidad biológica, a fin de mejorar su capacidad de proporcionar beneficios esenciales para el desarrollo sostenible',15),(131,'15.5 Adoptar medidas urgentes y significativas para reducir la degradación de los hábitats naturales, detener la pérdida de la diversidad biológica y, para 2020, proteger las especies amenazadas y evitar su extinción',15),(132,'15.6 Promover la participación justa y equitativa en los beneficios que se deriven de la utilización de los recursos genéticos y promover el acceso adecuado a esos recursos, como se ha convenido internacionalmente',15),(133,'15.7 Adoptar medidas urgentes para poner fin a la caza furtiva y el tráfico de especies protegidas de flora y fauna y abordar la demanda y la oferta ilegales de productos silvestres',15),(134,'15.8 Para 2020, adoptar medidas para prevenir la introducción de especies exóticas invasoras y reducir de forma significativa sus efectos en los ecosistemas terrestres y acuáticos y controlar o erradicar las especies prioritarias',15),(135,'15.9 Para 2020, integrar los valores de los ecosistemas y la diversidad biológica en la planificación nacional y local, los procesos de desarrollo, las estrategias de reducción de la pobreza y la contabilidad',15),(136,'15.a Movilizar y aumentar de manera significativa los recursos financieros procedentes de todas las fuentes para conservar y utilizar de forma sostenible la diversidad biológica y los ecosistemas',15),(137,'15.b Movilizar un volumen apreciable de recursos procedentes de todas las fuentes y a todos los niveles para financiar la gestión forestal sostenible y proporcionar incentivos adecuados a los países en desarrollo para que promuevan dicha gestión, en particular con miras a la conservación y la reforestación',15),(138,'15.c Aumentar el apoyo mundial a la lucha contra la caza furtiva y el tráfico de especies protegidas, en particular aumentando la capacidad de las comunidades locales para promover oportunidades de subsistencia sostenibles',15),(139,'16.1 Reducir significativamente todas las formas de violencia y las correspondientes tasas de mortalidad en todo el mundo',16),(140,'16.2 Poner fin al maltrato, la explotación, la trata y todas las formas de violencia y tortura contra los niños',16),(141,'16.3 Promover el estado de derecho en los planos nacional e internacional y garantizar la igualdad de acceso a la justicia para todos',16),(142,'16.4 De aquí a 2030, reducir significativamente las corrientes financieras y de armas ilícitas, fortalecer la recuperación y devolución de los activos robados y luchar contra todas las formas de delincuencia organizada',16),(143,'16.5 Reducir considerablemente la corrupción y el soborno en todas sus formas',16),(144,'16.6 Crear a todos los niveles instituciones eficaces y transparentes que rindan cuentas',16),(145,'16.7 Garantizar la adopción en todos los niveles de decisiones inclusivas, participativas y representativas que respondan a las necesidades',16),(146,'16.8 Ampliar y fortalecer la participación de los países en desarrollo en las instituciones de gobernanza mundial',16),(147,'16.9 De aquí a 2030, proporcionar acceso a una identidad jurídica para todos, en particular mediante el registro de nacimientos',16),(148,'16.10 Garantizar el acceso público a la información y proteger las libertades fundamentales, de conformidad con las leyes nacionales y los acuerdos internacionales',16),(149,'16.a Fortalecer las instituciones nacionales pertinentes, incluso mediante la cooperación internacional, para crear a todos los niveles, particularmente en los países en desarrollo, la capacidad de prevenir la violencia y combatir el terrorismo y la delincuencia',16),(150,'16.b Promover y aplicar leyes y políticas no discriminatorias en favor del desarrollo sostenible',16),(151,'17.1 Fortalecer la movilización de recursos internos, incluso mediante la prestación de apoyo internacional a los países en desarrollo, con el fin de mejorar la capacidad nacional para recaudar ingresos fiscales y de otra índole',17),(152,'17.2 Velar por que los países desarrollados cumplan plenamente sus compromisos en relación con la asistencia oficial para el desarrollo, incluido el compromiso de numerosos países desarrollados de alcanzar el objetivo de destinar el 0,7% del ingreso nacional bruto a la asistencia oficial para el desarrollo de los países en desarrollo y entre el 0,15% y el 0,20% del ingreso nacional bruto a la asistencia oficial para el desarrollo de los países menos adelantados',17),(153,'17.3 Movilizar recursos financieros adicionales de múltiples fuentes para los países en desarrollo',17),(154,'17.4 Ayudar a los países en desarrollo a lograr la sostenibilidad de la deuda a largo plazo con políticas coordinadas orientadas a fomentar la financiación, el alivio y la reestructuración de la deuda, según proceda, y hacer frente a la deuda externa de los países pobres muy endeudados a fin de reducir el endeudamiento excesivo',17),(155,'17.5 Adoptar y aplicar sistemas de promoción de las inversiones en favor de los países menos adelantados',17),(156,'17.6 Mejorar la cooperación regional e internacional Norte-Sur, Sur-Sur y triangular en materia de ciencia, tecnología e innovación y el acceso a estas, y aumentar el intercambio de conocimientos en condiciones mutuamente convenidas, incluso mejorando la coordinación entre los mecanismos existentes, en particular a nivel de las Naciones Unidas, y mediante un mecanismo mundial de facilitación de la tecnología',17),(157,'17.7 Promover el desarrollo de tecnologías ecológicamente racionales y su transferencia, divulgación y difusión a los países en desarrollo en condiciones favorables, incluso en condiciones concesionarias y preferenciales, según lo convenido de mutuo acuerdo',17),(158,'17.8 Poner en pleno funcionamiento, a más tardar en 2017, el banco de tecnología y el mecanismo de apoyo a la creación de capacidad en materia de ciencia, tecnología e innovación para los países menos adelantados y aumentar la utilización de tecnologías instrumentales, en particular la tecnología de la información y las comunicaciones',17),(159,'17.9 Aumentar el apoyo internacional para realizar actividades de creación de capacidad eficaces y específicas en los países en desarrollo a fin de respaldar los planes nacionales de implementación de todos los Objetivos de Desarrollo Sostenible, incluso mediante la cooperación Norte-Sur, Sur-Sur y triangular',17),(160,'17.10 Promover un sistema de comercio multilateral universal, basado en normas, abierto, no discriminatorio y equitativo en el marco de la Organización Mundial del Comercio, incluso mediante la conclusión de las negociaciones en el marco del Programa de Doha para el Desarrollo',17),(161,'17.11 Aumentar significativamente las exportaciones de los países en desarrollo, en particular con miras a duplicar la participación de los países menos adelantados en las exportaciones mundiales de aquí a 2020',17),(162,'17.12 Lograr la consecución oportuna del acceso a los mercados libre de derechos y contingentes de manera duradera para todos los países menos adelantados, conforme a las decisiones de la Organización Mundial del Comercio, incluso velando por que las normas de origen preferenciales aplicables a las importaciones de los países menos adelantados sean transparentes y sencillas y contribuyan a facilitar el acceso a los mercados',17),(163,'17.13 Aumentar la estabilidad macroeconómica mundial, incluso mediante la coordinación y coherencia de las políticas',17),(164,'17.14 Mejorar la coherencia de las políticas para el desarrollo sostenible',17),(165,'17.15 Respetar el margen normativo y el liderazgo de cada país para establecer y aplicar políticas de erradicación de la pobreza y desarrollo sostenible',17),(166,'17.16 Mejorar la Alianza Mundial para el Desarrollo Sostenible, complementada por alianzas entre múltiples interesados que movilicen e intercambien conocimientos, especialización, tecnología y recursos financieros, a fin de apoyar el logro de los Objetivos de Desarrollo Sostenible en todos los países, particularmente los países en desarrollo',17),(167,'17.17 Fomentar y promover la constitución de alianzas eficaces en las esferas pública, público-privada y de la sociedad civil, aprovechando la experiencia y las estrategias de obtención de recursos de las alianzas',17),(168,'17.18 De aquí a 2020, mejorar el apoyo a la creación de capacidad prestado a los países en desarrollo, incluidos los países menos adelantados y los pequeños Estados insulares en desarrollo, para aumentar significativamente la disponibilidad de datos oportunos, fiables y de gran calidad desglosados por ingresos, sexo, edad, raza, origen étnico, estatus migratorio, discapacidad, ubicación geográfica y otras características pertinentes en los contextos nacionales',17),(169,'17.19 De aquí a 2030, aprovechar las iniciativas existentes para elaborar indicadores que permitan medir los progresos en materia de desarrollo sostenible y complementen el producto interno bruto, y apoyar la creación de capacidad estadística en los países en desarrollo',17);
/*!40000 ALTER TABLE `ods_select` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `problem_opportunity`
--

DROP TABLE IF EXISTS `problem_opportunity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `problem_opportunity` (
  `id_problem_opportunity` int NOT NULL AUTO_INCREMENT,
  `description_problem_opportunity` varchar(255) NOT NULL,
  PRIMARY KEY (`id_problem_opportunity`),
  UNIQUE KEY `description_problem_opportunity_UNIQUE` (`description_problem_opportunity`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `problem_opportunity`
--

LOCK TABLES `problem_opportunity` WRITE;
/*!40000 ALTER TABLE `problem_opportunity` DISABLE KEYS */;
INSERT INTO `problem_opportunity` VALUES (9,'Hola, nos vemos...'),(6,'Juegos para los niños...,');
/*!40000 ALTER TABLE `problem_opportunity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `segment`
--

DROP TABLE IF EXISTS `segment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `segment` (
  `id_segment` int NOT NULL AUTO_INCREMENT,
  `description_segment` varchar(255) NOT NULL,
  PRIMARY KEY (`id_segment`),
  UNIQUE KEY `description_segment_UNIQUE` (`description_segment`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `segment`
--

LOCK TABLES `segment` WRITE;
/*!40000 ALTER TABLE `segment` DISABLE KEYS */;
INSERT INTO `segment` VALUES (4,'Hola');
/*!40000 ALTER TABLE `segment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `social_impact`
--

DROP TABLE IF EXISTS `social_impact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `social_impact` (
  `id_social_impact` int NOT NULL AUTO_INCREMENT,
  `description_social_impact` varchar(255) NOT NULL,
  PRIMARY KEY (`id_social_impact`),
  UNIQUE KEY `Social_Impactcol_UNIQUE` (`description_social_impact`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `social_impact`
--

LOCK TABLES `social_impact` WRITE;
/*!40000 ALTER TABLE `social_impact` DISABLE KEYS */;
INSERT INTO `social_impact` VALUES (3,'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadddd');
/*!40000 ALTER TABLE `social_impact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `solution`
--

DROP TABLE IF EXISTS `solution`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `solution` (
  `id_solution` int NOT NULL AUTO_INCREMENT,
  `description_solution` varchar(255) NOT NULL,
  PRIMARY KEY (`id_solution`),
  UNIQUE KEY `description_solution_UNIQUE` (`description_solution`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solution`
--

LOCK TABLES `solution` WRITE;
/*!40000 ALTER TABLE `solution` DISABLE KEYS */;
INSERT INTO `solution` VALUES (3,'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadddd');
/*!40000 ALTER TABLE `solution` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unfair_advantage`
--

DROP TABLE IF EXISTS `unfair_advantage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `unfair_advantage` (
  `id_unfair_advantage` int NOT NULL AUTO_INCREMENT,
  `description_unfair_advantage` varchar(255) NOT NULL,
  PRIMARY KEY (`id_unfair_advantage`),
  UNIQUE KEY `Unfair_Advantagecol_UNIQUE` (`description_unfair_advantage`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unfair_advantage`
--

LOCK TABLES `unfair_advantage` WRITE;
/*!40000 ALTER TABLE `unfair_advantage` DISABLE KEYS */;
INSERT INTO `unfair_advantage` VALUES (4,'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadddd');
/*!40000 ALTER TABLE `unfair_advantage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `uvp`
--

DROP TABLE IF EXISTS `uvp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `uvp` (
  `id_uvp` int NOT NULL AUTO_INCREMENT,
  `description_uvp` varchar(255) NOT NULL,
  PRIMARY KEY (`id_uvp`),
  UNIQUE KEY `Uvpcol_UNIQUE` (`description_uvp`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `uvp`
--

LOCK TABLES `uvp` WRITE;
/*!40000 ALTER TABLE `uvp` DISABLE KEYS */;
INSERT INTO `uvp` VALUES (18,'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadddd');
/*!40000 ALTER TABLE `uvp` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-21 21:25:04
