package me.rgn.asceciacurrencies.message;
import me.rgn.asceciacurrencies.files.LanguageConfig;

public class Messages {
    public static void mlist() {
        //default language
        if (!LanguageConfig.get().contains("language")){
            LanguageConfig.get().set("language", "en-us");
        }

        //messages in english
        LanguageConfig.get().set("en-us.message-0", "[Currencies]: The Currency ");
        LanguageConfig.get().set("en-us.message-0_1", " Has been Created ");

        LanguageConfig.get().set("en-us.message-1", "[Currencies]: Your Currency Has been deleted");
        LanguageConfig.get().set("en-us.message-1_1", "[Currencies]: You deleted a Currency and no ores will be given.");

        LanguageConfig.get().set("en-us.message-2", "[Currencies]: You minted ");

        LanguageConfig.get().set("en-us.message-3", "[Currencies]: You deposited");
        LanguageConfig.get().set("en-us.message-3_1", " iron Worth of ores to your currency");

        LanguageConfig.get().set("en-us.message-4", "You succesfully payed ");
        LanguageConfig.get().set("en-us.message-4_1", "You succesfully recieved ");
        LanguageConfig.get().set("en-us.message-4_2", " to ");
        LanguageConfig.get().set("en-us.message-4_3", " from ");

        LanguageConfig.get().set("en-us.message-5", "[Currencies]: You Withdrew ");

        LanguageConfig.get().set("en-us.message-6", "[Currencies]: Description set ! ");

        LanguageConfig.get().set("en-us.message-7", "| Ascecia Currencies | Help | \n \n /currencies create (name) - creates a currency  \n /currencies delete (name) - deletes your currency \n /currencies withdraw (name) (amount) - turn back an amount of your currency into iron \n /currencies info (name) - gives you info about a currency \n /currencies list - gives you a list of all currencies available \n /currencies mint (name) (amount) - makes an amount of currency \n /currencies deposit (nombre) - deposit the amount of ores you're holding in your hand into your currency to increase its power \n /currencies pay (playername) (name) (amount) - pays the target with an amount of currency \n /currencies wallet - give you details about your wallet \n /currencies top (all/one) (page/monnaie) (page) - Leaderboard of the richest /currencies team (set/add/remove) - Manage a currency's team");

        LanguageConfig.get().set("en-us.message-8", "| Currency Info -> | ");
        LanguageConfig.get().set("en-us.message-8_1", " | \n \n Amount of Currency available on the market: ");
        LanguageConfig.get().set("en-us.message-8_2", "\n Power of the currency: ");
        LanguageConfig.get().set("en-us.message-8_3", "\n Number of users: ");
        LanguageConfig.get().set("en-us.message-8_4", "\n Economic Activity of the currency: ");
        LanguageConfig.get().set("en-us.message-8_5", "\n Total value of the currency: ");
        LanguageConfig.get().set("en-us.message-8_6", "\n Author: ");
        LanguageConfig.get().set("en-us.message-8_7", "\n Description: ");

        LanguageConfig.get().set("en-us.message-9","\n | Ascecia-Currencies | Currency-List | \n \n");
        LanguageConfig.get().set("en-us.message-9_1",": \n      Power: ");
        LanguageConfig.get().set("en-us.message-9_2","\n        Economic-Activity: ");

        LanguageConfig.get().set("en-us.message-10","\n | Ascecia-Currencies | Wallet | \n \n");
        LanguageConfig.get().set("en-us.message-10_1","\n       Balance: ");

        LanguageConfig.get().set("en-us.message-11", " Has been renamed to ");

        LanguageConfig.get().set("en-us.message-12", "[Currencies]: Configuration Reloaded !");

        LanguageConfig.get().set("en-us.message-13", "| Ascecia Currencies | Top |");

        LanguageConfig.get().set("en-us.message-14", "Language set !");

        LanguageConfig.get().set("en-us.message-15", "[Currencies]: Value set !");

        LanguageConfig.get().set("en-us.message-16", "[Ascecia Currencies]: Teams: \n \n");

        //errors in english
        LanguageConfig.get().set("en-us.error-0", "[Currencies]: /currencies create (currencyname)");
        LanguageConfig.get().set("en-us.error-0_1", "[Currencies]: Your currency needs to be 3 caracthers long minimum and 9 max and not use any special characters or numbers or spaces");
        LanguageConfig.get().set("en-us.error-0_2", "[Currencies]: The Currency Already Exists");
        LanguageConfig.get().set("en-us.error-0_3", "[Currencies]: You Have Already Created a currency");

        LanguageConfig.get().set("en-us.error-1", "[Currencies]: /currencies delete (currencyname)");
        LanguageConfig.get().set("en-us.error-1_1", "[Currencies]: You are not the owner of this currency !");

        LanguageConfig.get().set("en-us.error-2", "[Currencies]: /currencies description (description)");

        LanguageConfig.get().set("en-us.error-3", "[Currencies]: /currencies force delete (currencyname)");

        LanguageConfig.get().set("en-us.error-4", "[Currencies]: /currencies info (currencyname)");
        LanguageConfig.get().set("en-us.error-4_1", "[Currencies]: This Currency Doesn't exist");

        LanguageConfig.get().set("en-us.error-5", "[Currencies]: No currencies available. create one with /currencies create");

        LanguageConfig.get().set("en-us.error-6", "[Currencies]: /currencies mint (name) (amount)");

        LanguageConfig.get().set("en-us.error-7", "[Currencies]: you don't have a currency. create one using /currencies create");

        LanguageConfig.get().set("en-us.error-8", "you need to make at least one of your currency do /currencies mint !");
        LanguageConfig.get().set("en-us.error-8_1", "The chosen material is not an ore and thus can't be deposited in your currency !");
        LanguageConfig.get().set("en-us.error-8_2", "/c deposit (name)");

        LanguageConfig.get().set("en-us.error-9", "[Currencies]: /currencies pay (playername) (currencyname) (amount)");
        LanguageConfig.get().set("en-us.error-9_1", "[Currencies]: The Player Specified isn't Online");
        LanguageConfig.get().set("en-us.error-9_2", "[Currencies]: The Currency Specified doesn't exist");
        LanguageConfig.get().set("en-us.error-9_3", "[Currencies]: You do not have enough money");
        LanguageConfig.get().set("en-us.error-9_4", "[Currencies]: You Can't give yourself money");

        LanguageConfig.get().set("en-us.error-10", "[Currencies]: /currencies withdraw (currencyname) (amount)");
        LanguageConfig.get().set("en-us.error-10_1", "[Currencies]: The amount entered is too low !");
        LanguageConfig.get().set("en-us.error-10_2", "[Currencies]: The Currency specified does not exist !");
        LanguageConfig.get().set("en-us.error-10_3", "[Currencies]: You do not have enough money !");
        LanguageConfig.get().set("en-us.error-10_4", "[Currencies]: The amount entered is too high !");

        LanguageConfig.get().set("en-us.error-11", "[Currencies]: You do not have the permission to do this !");

        LanguageConfig.get().set("en-us.error-12", "[Currencies]: You do not own any currency !");
        LanguageConfig.get().set("en-us.error-12_1", "[Currencies]: /currencies rename (name)");
        LanguageConfig.get().set("en-us.error-12_2", "[Currencies]: The new Name can't be the same as the old one !");

        LanguageConfig.get().set("en-us.error-13", "[Currencies]: /currencies top (all/one) (currency/page) (page)");
        LanguageConfig.get().set("en-us.error-13_1", "[Currencies]: This currency doesn't exist");

        LanguageConfig.get().set("en-us.error-14", "[Currencies]: /currencies language (language)");
        LanguageConfig.get().set("en-us.error-14_1", "[Currencies]: this language isn't in the configuration");

        LanguageConfig.get().set("en-us.error-15", "[Currencies]: this ore value isn't in the configuration");
        LanguageConfig.get().set("en-us.error-15_1", "[Currencies]: /c ore (ore) (value)");

        LanguageConfig.get().set("en-us.error-16", "[Currencies]: /c team (set/add/remove) list:(currencyname)/others:(playername) set:(true/false)");
        LanguageConfig.get().set("en-us.error-16_1", "[Currencies]: This Permission doesn't exist !");
        LanguageConfig.get().set("en-us.error-16_2", "[Currencies]: This Player isn't in the team !");

        //messages en français
        LanguageConfig.get().set("fr-FR.message-0", "[Currencies]: La monnaie ");
        LanguageConfig.get().set("fr-FR.message-0_1", " à été crée ");

        LanguageConfig.get().set("fr-FR.message-1", "[Currencies]: Votre monnaie à été supprimée");
        LanguageConfig.get().set("fr-FR.message-1_1", "[Currencies]: Vous avez supprimé(e) une monnaie et aucun minerais ne seront distribués");

        LanguageConfig.get().set("fr-FR.message-2", "[Currencies]: Vous avez frappé(e) ");

        LanguageConfig.get().set("fr-FR.message-3", "[Currencies]: Vous avez déposé(e) l'équivalent de");
        LanguageConfig.get().set("fr-FR.message-3_1", " en fer");

        LanguageConfig.get().set("fr-FR.message-4", "Vous avez payé(e) ");
        LanguageConfig.get().set("fr-FR.message-4_1", "Vous avez recu(e) ");
        LanguageConfig.get().set("fr-FR.message-4_2", " à ");
        LanguageConfig.get().set("fr-FR.message-4_3", " de ");

        LanguageConfig.get().set("fr-FR.message-5", "[Currencies]: Vous avez repris ");

        LanguageConfig.get().set("fr-FR.message-6", "[Currencies]: Description définie ! ");

        LanguageConfig.get().set("fr-FR.message-7", "| Ascecia Currencies | Aide | \n /currencies create (nom) - creer une monnaie  \n /currencies delete (nom) - supprime une monnaie \n /currencies withdraw (nom) (montant) - vous redonne des minerais que vous avez mis en fonction du montant entré \n /currencies info (nom) - une liste d'infos sur une monnaie \n /currencies list - liste de toutes les monnaies existante \n /currencies mint (nom) (montant) - frappe un montant de monnaie \n /currencies deposit (nom) - depose le nombre de minerais que vous tenez dans votre main pour augmenter la valeur et la puissance de votre monnaie \n /currencies pay (nom du joueur) (nom de la monnaie) (montant) - paye la personne concernée \n /currencies wallet - vous montre votre porte-feuille \n /currencies top (all/one) (page/monnaie) (page) - classement des joueurs les plus riches \n /currencies team (set/add/remove/list) - Gérer l'équipe du monnaie");

        LanguageConfig.get().set("fr-FR.message-8", "| Monnaie Info -> | ");
        LanguageConfig.get().set("fr-FR.message-8_1", " | \n \n Montant de monnaie disponible sur le marché: ");
        LanguageConfig.get().set("fr-FR.message-8_2", "\n Puissance de la monnaie: ");
        LanguageConfig.get().set("fr-FR.message-8_3", "\n Nombre d'utilisateurs: ");
        LanguageConfig.get().set("fr-FR.message-8_4", "\n Activité economique de la monnaie: ");
        LanguageConfig.get().set("fr-FR.message-8_5", "\n Valeur totale de la monnaie: ");
        LanguageConfig.get().set("fr-FR.message-8_6", "\n Auteur: ");
        LanguageConfig.get().set("fr-FR.message-8_7", "\n Description: ");

        LanguageConfig.get().set("fr-FR.message-9","\n | Ascecia-Currencies | Liste des monnaies | \n \n");
        LanguageConfig.get().set("fr-FR.message-9_1",": \n      Puissance: ");
        LanguageConfig.get().set("fr-FR.message-9_2","\n        Activité Economique: ");

        LanguageConfig.get().set("fr-FR.message-10","\n | Ascecia-Currencies | Porte-feuille | \n \n");
        LanguageConfig.get().set("fr-FR.message-10_1"," \n      Solde: ");

        LanguageConfig.get().set("fr-FR.message-11", " est maintenant nommé ");

        LanguageConfig.get().set("fr-FR.message-12", "[Currencies]: Configuration rechargée !");

        LanguageConfig.get().set("fr-FR.message-13", "| Ascecia Currencies | Top |");

        LanguageConfig.get().set("fr-FR.message-14", "Langue Définie !");

        LanguageConfig.get().set("fr-FR.message-15", "Valeur Définie !");

        LanguageConfig.get().set("fr-FR.message-16", "[Ascecia Currencies]: Teams: \n \n");
        //erreur en français
        LanguageConfig.get().set("fr-FR.error-0", "[Currencies]: /currencies create (nom)");
        LanguageConfig.get().set("fr-FR.error-0_1", "[Currencies]: le nom de votre monnaie doit faire minimum 3 caractères et max 9 et il ne doit contenir ni nombre ni caractères spéciaux.");
        LanguageConfig.get().set("fr-FR.error-0_2", "[Currencies]: Une monnaie du même nom existe déja");
        LanguageConfig.get().set("fr-FR.error-0_3", "[Currencies]: Vous avez déja crée une monnaie");

        LanguageConfig.get().set("fr-FR.error-1", "[Currencies]: /currencies delete (nom)");
        LanguageConfig.get().set("fr-FR.error-1_1", "[Currencies]: Vous ne possèdez pas cette monnaie ou la monnaie n'éxiste pas !");

        LanguageConfig.get().set("fr-FR.error-2", "[Currencies]: /currencies description (description)");

        LanguageConfig.get().set("fr-FR.error-3", "[Currencies]: /currencies force delete (nom)");

        LanguageConfig.get().set("fr-FR.error-4", "[Currencies]: /currencies info (nom)");
        LanguageConfig.get().set("fr-FR.error-4_1", "[Currencies]: La monnaie spécifiée n'éxiste pas");

        LanguageConfig.get().set("fr-FR.error-5", "[Currencies]: Aucune monnaie disponible. Créez-en une avec /currencies create");

        LanguageConfig.get().set("fr-FR.error-6", "[Currencies]: /currencies mint (nom) (montant)");

        LanguageConfig.get().set("fr-FR.error-7", "[Currencies]: Vous ne possèdez pas de monnaie. Créez-en une avec /currencies create");

        LanguageConfig.get().set("fr-FR.error-8", " Vous devez avoir frapper minimum 1 de votre monnaie pour pouvoir deposer des minerais /currencies mint (nom) (montant) !");
        LanguageConfig.get().set("fr-FR.error-8_1", "Le materiaux tenu dans votre main n'est pas spécifié !");
        LanguageConfig.get().set("fr-FR.error-8_2", "/c deposit (nom)");

        LanguageConfig.get().set("fr-FR.error-9", "/currencypay (nom du joueur) (nom de la monnaie) (montant)");
        LanguageConfig.get().set("fr-FR.error-9_1", "[Currencies]: Le joueur n'est pas en ligne");
        LanguageConfig.get().set("fr-FR.error-9_2", "[Currencies]: La monnaie spécifiée n'éxiste pas");
        LanguageConfig.get().set("fr-FR.error-9_3", "[Currencies]: Vous n'avez pas assez d'argent pour payer !");
        LanguageConfig.get().set("fr-FR.error-9_4", "[Currencies]: Vous ne pouvez pas vous donner de l'argent");

        LanguageConfig.get().set("fr-FR.error-10", "[Currencies]: /currencies withdraw (nom) (montant)");
        LanguageConfig.get().set("fr-FR.error-10_1", "[Currencies]: Le montant entré est trop faible");
        LanguageConfig.get().set("fr-FR.error-10_2", "[Currencies]: La monnaie spécifiée n'éxiste pas");
        LanguageConfig.get().set("fr-FR.error-10_3", "[Currencies]: Vous ne possèdez pas assez d'argent");
        LanguageConfig.get().set("fr-FR.error-10_4", "[Currencies]: Le montant entré est trop élevé !");

        LanguageConfig.get().set("fr-FR.error-11", "[Currencies]: Vous n'avez pas la permission de faire cela !");

        LanguageConfig.get().set("fr-FR.error-12", "[Currencies]: Vous n'avez pas de monnaie !");
        LanguageConfig.get().set("fr-FR.error-12_1", "[Currencies]: /currencies rename (nom)");
        LanguageConfig.get().set("fr-FR.error-12_2", "[Currencies]: Le nouveau nom ne peut pas être le même que l'ancien");

        LanguageConfig.get().set("fr-FR.error-13", "[Currencies]: /currencies top (all/one) (monnaie/page) (page)");
        LanguageConfig.get().set("fr-FR.error-13_1", "[Currencies]: Cette Monnaie n'existe pas");

        LanguageConfig.get().set("fr-FR.error-14", "[Currencies]: /currencies language (langue)");
        LanguageConfig.get().set("fr-FR.error-14_1", "[Currencies]: Cette langue n'est pas référencé dans la configuration");

        LanguageConfig.get().set("fr-FR.error-15", "[Currencies]: Cette valeur n'est pas référencé dans la configuration");
        LanguageConfig.get().set("fr-FR.error-15_1", "[Currencies]: /currencies ore (minerais) (valeur)");

        LanguageConfig.get().set("fr-FR.error-16", "[Currencies]: /currencies team (set/add/remove/list) list:(nom de la monnaie)/autres:(nom du joueur) set:(true/false)");
        LanguageConfig.get().set("fr-FR.error-16_1", "[Currencies]: La permission n'existe pas !");
        LanguageConfig.get().set("fr-FR.error-16_2", "[Currencies]: Le joueur n'est pas dans la team !");

        LanguageConfig.save();

        //espanol

        //messages en espanol
        LanguageConfig.get().set("es-ES.message-0", "[Currencies]: La moneda");
        LanguageConfig.get().set("es-ES.message-0_1", " se ha creado");

        LanguageConfig.get().set("es-ES.message-1", "Currencies]: tú moneda se ha suprimido");
        LanguageConfig.get().set("es-ES.message-1_1", "[Currencies]: tú moneda se ha suprimido y no se donaran minerales");

        LanguageConfig.get().set("es-ES.message-2", "[Currencies]: Has acuñado");

        LanguageConfig.get().set("es-ES.message-3", "[Currencies]: Depositado ");
        LanguageConfig.get().set("es-ES.message-3_1", " unidades de valor de los minerales en tú moneda");

        LanguageConfig.get().set("es-ES.message-4", "[Currencies]: Pagó ");
        LanguageConfig.get().set("es-ES.message-4_1", "[Currencies]: Recibido ");
        LanguageConfig.get().set("es-ES.message-4_2", " a ");
        LanguageConfig.get().set("es-ES.message-4_3", " de ");

        LanguageConfig.get().set("es-ES.message-5", "[Currencies]: Retiraste");

        LanguageConfig.get().set("es-ES.message-6", "[Currencies]: Descripción definida !");

        LanguageConfig.get().set("es-ES.message-7", "| Ascecia Currencies | Ayuda | \n \n /currencies create (nombre) - crear una moneda \n /currencies delete (nombre) - supprimir una moneda \n /currencies witdraw (nombre) (cantidad) - Retirar alguna cantidad de moneda \n /currencies info (nombre) - Información sobre una moneda \n /currencies list - Lista de las monedas \n /currencies mint (nombre) (cantidad) - acuñar alguna cantidad de moneda \n /currencies deposit (nombre) - Depositar las minerales que son en tú mano \n /currencies pay (nombre del jugador) (nombre de la moneda) (cantidad) - Pagar una cantidad de moneda a una otra persona \n /currencies wallet - muestra tú cartera \n /currencies top (all/one) (pagina/nombre) (pagina) - El clasificación de los que son más ricos \n /currencies team (set/add/remove/list) - equipo para currencies");

        LanguageConfig.get().set("es-ES.message-8", "\n | Ascecia-Currencies | Moneda info -> | ");
        LanguageConfig.get().set("es-ES.message-8_1", " | \n \n Cantidad de moneda en circulación: ");
        LanguageConfig.get().set("es-ES.message-8_2", "\n Potencia de la moneda: ");
        LanguageConfig.get().set("es-ES.message-8_3", "\n Número de usuarios: ");
        LanguageConfig.get().set("es-ES.message-8_4", "\n Actividad económica de la moneda:");
        LanguageConfig.get().set("es-ES.message-8_5", "\n Valor de la moneda: ");
        LanguageConfig.get().set("es-ES.message-8_6", "\n Autor: ");
        LanguageConfig.get().set("es-ES.message-8_7", "\n Descripción: ");

        LanguageConfig.get().set("es-ES.message-9","\n | Ascecia-Currencies | Lista de las monedas | \n \n");
        LanguageConfig.get().set("es-ES.message-9_1","\n      Potencia: ");
        LanguageConfig.get().set("es-ES.message-9_2","\n      Actividad económica: ");

        LanguageConfig.get().set("es-ES.message-10","\n | Ascecia-Currencies | Carrera | \n \n");
        LanguageConfig.get().set("es-ES.message-10_1"," \n      Saldo: ");

        LanguageConfig.get().set("es-ES.message-11", " Se ha Renombrada a ");

        LanguageConfig.get().set("es-ES.message-12", "[Currencies]: Configuración Recargada !");

        LanguageConfig.get().set("es-ES.message-13", "| Ascecia Currencies | Top |");

        LanguageConfig.get().set("es-ES.message-14", "[Currencies]: Idioma definida !");

        LanguageConfig.get().set("es-ES.message-15", "[Currencies]: Numeró definido !");

        LanguageConfig.get().set("es-ES.message-16", "[Ascecia Currencies]: Teams: \n \n");

        //erreur en français
        LanguageConfig.get().set("es-ES.error-0", "[Currencies]: /currencies create (nombre)");
        LanguageConfig.get().set("es-ES.error-0_1", "[Currencies]: el nombre de su divisa debe tener un mínimo de 3 caracteres y un máximo de 9 y no debe contener números ni caracteres especiales.");
        LanguageConfig.get().set("es-ES.error-0_2", "[Currencies]: Ya existe una moneda con el mismo nombre");
        LanguageConfig.get().set("es-ES.error-0_3", "[Currencies]: Ya ha creado una moneda");

        LanguageConfig.get().set("es-ES.error-1", "[Currencies]: /currencies delete (nombre)");
        LanguageConfig.get().set("es-ES.error-1_1", "[Currencies]: La moneda no está tú propiedad");

        LanguageConfig.get().set("es-ES.error-2", "[Currencies]: /currencies description (descripción)");

        LanguageConfig.get().set("es-ES.error-3", "[Currencies]: /currencies force delete (nombre)");

        LanguageConfig.get().set("es-ES.error-4", "[Currencies]: /currencies info (nombre)");
        LanguageConfig.get().set("es-ES.error-4_1", "[Currencies]: Este moneda no existe");

        LanguageConfig.get().set("es-ES.error-5", "[Currencies]: No hay alguna moneda. Crea una moneda con /currencies create");

        LanguageConfig.get().set("es-ES.error-6", "[Currencies]: /currencies mint (nombre) (cantidad)");

        LanguageConfig.get().set("es-ES.error-7", "[Currencies]: No tiene una moneda. Crea una con /currencies create");

        LanguageConfig.get().set("es-ES.error-8", " Necesita de acuñar al menos un unidad de moneda ! /currencies mint (cantidad)");
        LanguageConfig.get().set("es-ES.error-8_1", "El material que tiene no es specificado");
        LanguageConfig.get().set("fr-FR.error-8_2", "/c deposit (nombre)");

        LanguageConfig.get().set("es-ES.error-9", "[Currencies]: /currencies pay (nombre del jugador) (nombre de la moneda) (cantidad)");
        LanguageConfig.get().set("es-ES.error-9_1", "[Currencies]: El jugador no está conectado");
        LanguageConfig.get().set("es-ES.error-9_2", "[Currencies]: La moneda especificada no existe");
        LanguageConfig.get().set("es-ES.error-9_3", "[Currencies]: No tienes suficiente dinero para pagar");
        LanguageConfig.get().set("es-ES.error-9_4", "[Currencies]: No puede darse dinero");

        LanguageConfig.get().set("es-ES.error-10", "[Currencies]: /currencies withdraw (nombre) (cantidad)");
        LanguageConfig.get().set("es-ES.error-10_1", "[Currencies]: La cantidad está demasiado bajo (< 1)");
        LanguageConfig.get().set("es-ES.error-10_2", "[Currencies]: Este moneda no existe");
        LanguageConfig.get().set("es-ES.error-10_3", "[Currencies]: No tiene Moneda ! ");
        LanguageConfig.get().set("es-ES.error-10_4", "[Currencies]: La cantidad está demasiado alta !");

        LanguageConfig.get().set("es-ES.error-11", "[Currencies]: No tiene los permisos para hacer eso !");

        LanguageConfig.get().set("es-ES.error-12", "[Currencies]: No tiene moneda !");
        LanguageConfig.get().set("es-ES.error-12_1", "[Currencies]: /currencies rename (nombre)");
        LanguageConfig.get().set("es-ES.error-12_2", "[Currencies]: El nuevo nombre debe ser diferente del anterior");

        LanguageConfig.get().set("es-ES.error-13", "[Currencies]: /currencies top (all/one) (moneda/pagina) (pagina)");
        LanguageConfig.get().set("es-ES.error-13_1", "[Currencies]: Este moneda no existe");

        LanguageConfig.get().set("es-ES.error-14", "[Currencies]: /currencies language (idioma)");
        LanguageConfig.get().set("es-ES.error-14_1", "[Currencies]: Este Idioma no está en la configuración !");

        LanguageConfig.get().set("es-ES.error-15", "[Currencies]: Este minerales no está en la configuración !");
        LanguageConfig.get().set("en-ES.error-15_1", "[Currencies]: /currencies ore (minerale) (numeró)");

        LanguageConfig.get().set("es-ES.error-16", "[Currencies]: /currencies team (set/add/remove/list) list:(nombre de la moneda)/otros:(nombre del jugador) set:(true/false)");
        LanguageConfig.get().set("es-ES.error-16_1", "[Currencies]: La Permission no existe !");
        LanguageConfig.get().set("es-ES.error-16_2", "[Currencies]: El Jugador no es en el equipo !");

        LanguageConfig.save();
    }
}