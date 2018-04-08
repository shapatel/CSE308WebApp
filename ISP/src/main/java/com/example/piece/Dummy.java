/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.piece;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Thomas
 */
//SAMPLE MASSACHUSSETTS STATE
//CONTAINS TOWN NAMES
public class Dummy {

    //DATA NEEDS TO BE CLEANED
    Statistics stat;
    String precinctNamesDistrict1[] = {
        "Adams",
        "Alford",
        "Becket",
        "Cheshire",
        "Clarksburg",
        "Dalton",
        "Egremont",
        "Florida",
        "Great Barrington",
        "Hancock",
        "Hinsdale",
        "Lanesborough",
        "Lee",
        "Lenox",
        "Monterey",
        "Mount Washington",
        "New Ashford",
        "New Marlborough",
        "NORTH ADAMS",
        "Otis",
        "Peru",
        "PITTSFIELD",
        "Richmond",
        "Sandisfield",
        "Savoy",
        "Sheffield",
        "Stockbridge",
        "Tyringham",
        "Washington",
        "West Stockbridge",
        "Williamstown",
        "Windsor",
        "Ashfield",
        "Bernardston",
        "Buckland",
        "Charlemont",
        "Colrain",
        "Conway",
        "Hawley",
        "Heath",
        "Leyden",
        "Monroe",
        "Rowe",
        "Shelburne",
        "Agawam",
        "Blandford",
        "Brimfield",
        "Chester",
        "CHICOPEE",
        "East Longmeadow",
        "Granville",
        "Hampden",
        "Holland",
        "HOLYOKE",
        "Longmeadow",
        "Ludlow",
        "Monson",
        "Montgomery",
        "Palmer",
        "Russell",
        "Southwick",
        "SPRINGFIELD",
        "Tolland",
        "Wales",
        "West Springfield",
        "WESTFIELD",
        "Wilbraham",
        "Chesterfield",
        "Cummington",
        "Easthampton",
        "Goshen",
        "Granby",
        "Huntington",
        "Middlefield",
        "Plainfield",
        "South Hadley",
        "Southampton",
        "Westhampton",
        "Williamsburg ",
        "Worthington",
        "Brookfield",
        "Charlton",
        "Dudley",
        "East Brookfield",
        "Southbridge",
        "Sturbridge",
        "Warren"};
    String[] precinctNamesDistrict2 = {
        "Deerfield",
        "Erving",
        "Gill",
        "Greenfield",
        "Leverett",
        "Montague",
        "New Salem",
        "Northfield",
        "Orange",
        "Shutesbury",
        "Sunderland",
        "Warwick",
        "Wendell",
        "Whately",
        "Amherst",
        "Belchertown",
        "Hadley",
        "Hatfield",
        "NORTHAMPTON ",
        "Pelham ",
        "Ware",
        "Bellingham - Pcts. 4A, 5",
        "Athol",
        "Auburn",
        "Barre",
        "Blackstone",
        "Boylston",
        "Douglas",
        "Grafton",
        "Hardwick",
        "Holden",
        "Hubbardston",
        "Leicester ",
        "LEOMINSTER",
        "Mendon",
        "Millbury",
        "Millville",
        "New Braintree",
        "North Brookfield",
        "Northborough",
        "Northbridge",
        "Oakham",
        "Oxford",
        "Paxton",
        "Petersham",
        "Phillipston",
        "Princeton",
        "Royalston",
        "Rutland",
        "Shrewsbury",
        "Spencer",
        "Sterling",
        "Sutton",
        "Templeton",
        "Upton",
        "Uxbridge",
        "Webster",
        "West Boylston",
        "West Brookfield",
        "Westborough ",
        "Winchendon - Pct. 1",
        "WORCESTER"};

    String[] precinctNamesDistrict3 = {
        "Andover - Pcts. 2-7, 9 ",
        "HAVERHILL",
        "LAWRENCE ",
        "Methuen",
        "Acton",
        "Ashby",
        "Ayer",
        "Boxborough",
        "Carlisle",
        "Chelmsford",
        "Concord",
        "Dracut",
        "Dunstable",
        "Groton",
        "Hudson",
        "Littleton ",
        "LOWELL ",
        "MARLBOROUGH",
        "Maynard",
        "Pepperell",
        "Shirley",
        "Stow",
        "Sudbury - Pct. 1",
        "Townsend",
        "Tyngsborough",
        "Westford",
        "Ashburnham",
        "Berlin",
        "Bolton",
        "Clinton ",
        "FITCHBURG",
        "GARDNER",
        "Harvard",
        "Lancaster",
        "Lunenburg",
        "Westminster ",
        "Winchendon - Pcts. 1A, 2, 3"
    };

    String[] precinctNamesDistrict4 = {
        "ATTLEBORO",
        "Berkley",
        "Dighton",
        "Easton",
        "FALL RIVER Wd. 4, Pct. C",
        "FALL RIVER Wd. 5, Pct. B1",
        "FALL RIVER Wd. 5, Pct. C",
        "FALL RIVER Wd. 6, Pct. C1 ",
        "FALL RIVER Wds. 7, 8 and 9",
        "Freetown",
        "Mansfield",
        "North Attleborough",
        "Norton",
        "Raynham - Pcts. 1A, 2A, 3, 4",
        "Rehoboth",
        "Seekonk",
        "Somerset",
        "Swansea",
        "TAUNTON",
        "Hopkinton",
        "NEWTON",
        "Bellingham - Pcts. 1, 2, 3, 4",
        "Brookline",
        "Dover",
        "Foxborough",
        "Franklin",
        "Medfield",
        "Medway",
        "Millis",
        "Needham",
        "Norfolk",
        "Plainville",
        "Sharon",
        "Wellesley",
        "Wrentham",
        "Lakeville",
        "Hopedale",
        "Milford"};
    String[] precinctNamesDistrict5 = {
        "Arlington",
        "Ashland",
        "Belmont",
        "CAMBRIDGE Wd. 3, Pct. 2A",
        "CAMBRIDGE Wd. 4, Pcts. 2, 3 ",
        "CAMBRIDGE Wds. 6, 7, 8, 9",
        "CAMBRIDGE Wd. 10, Pcts. 1, 2",
        "Framingham",
        "Holliston",
        "Lexington",
        "Lincoln ",
        "MALDEN",
        "MEDFORD ",
        "MELROSE",
        "Natick",
        "Sherborn",
        "Stoneham",
        "Sudbury - Pcts. 1A, 2, 3, 4, 5",
        "WALTHAM",
        "Watertown",
        "Wayland",
        "Weston",
        "Winchester",
        "WOBURN",
        "REVERE",
        "Winthrop",
        "Southborough"
    };
    String[] precinctNamesDistrict6 = {
        "Amesbury ",
        "Andover - Pcts. 1, 7A, 8, 9A",
        "BEVERLY",
        "Boxford",
        "Danvers",
        "Essex",
        "Georgetown",
        "GLOUCESTER",
        "Groveland",
        "Hamilton",
        "Ipswich ",
        "LYNN",
        "Lynnfield",
        "Manchester-by-the-Sea",
        "Marblehead",
        "Merrimac",
        "Middleton",
        "Nahant",
        "Newbury",
        "NEWBURYPORT",
        "North Andover",
        "PEABODY",
        "Rockport",
        "Rowley ",
        "SALEM",
        "Salisbury",
        "Saugus",
        "Swampscott",
        "Topsfield",
        "Wenham",
        "West Newbury",
        "Bedford",
        "Billerica",
        "Burlington",
        "North Reading",
        "Reading",
        "Tewksbury",
        "Wakefield",
        "Wilmington"
    };
    String[] precinctNamesDistrict7 = {
        "CAMBRIDGE Wds. 1, 2, 3",
        "CAMBRIDGE Wd. 4, Pct. 1",
        "CAMBRIDGE Wd. 5",
        "CAMBRIDGE Wd. 10, Pct. 3",
        "CAMBRIDGE Wd. 11",
        "EVERETT",
        "SOMERVILLE",
        "Milton - Pcts. 1, 5, 10",
        "Randolph",
        "BOSTON Wds. 1, 2",
        "BOSTON Wd. 3, Pcts. 7, 8 ",
        "BOSTON Wd. 4",
        "BOSTON Wd. 5, Pcts. 1, 2, 2A, 6, 7, 8, 9, 10",
        "BOSTON Wd. 7, Pct. 10",
        "BOSTON Wds. 8, 9, 10",
        "BOSTON Wd. 11, Pcts. 1, 2, 3, 4, 5, 6, 7, 8",
        "BOSTON Wd. 12",
        "BOSTON Wd. 13, Pcts. 1, 2, 4, 5, 6, 8, 9 ",
        "BOSTON Wds. 14, 15",
        "BOSTON Wd. 16, Pcts. 1, 3, 4, 6, 8, 11",
        "BOSTON Wds. 17, 18",
        "BOSTON Wd. 19, Pcts. 7, 10, 11, 12, 13",
        "BOSTON Wd. 20, Pct. 3",
        "BOSTON Wds. 21, 22",
        "CHELSEA"
    };
    String[] precinctNamesDistrict8 = {
        "Raynham - Pcts. 1, 2",
        "Avon",
        "Braintree",
        "Canton",
        "Cohasset",
        "Dedham",
        "Holbrook",
        "Milton - Pcts. 2, 3, 4, 6, 7, 8, 9",
        "Norwood",
        "QUINCY",
        "Stoughton",
        "Walpole",
        "Westwood",
        "Weymouth",
        "Abington",
        "Bridgewater",
        "BROCKTON",
        "East Bridgewater",
        "Hingham",
        "Hull",
        "Scituate",
        "West Bridgewater",
        "Whitman",
        "BOSTON Wd. 3, Pcts. 1, 2, 3, 4, 5, 6",
        "BOSTON Wd. 5, Pcts. 3, 4, 5, 11",
        "BOSTON Wd. 6",
        "BOSTON Wd. 7, Pcts. 1, 2, 3, 4, 5, 6, 7, 8, 9 ",
        "BOSTON Wd. 11, Pcts. 9, 10",
        "BOSTON Wd. 13, Pcts. 3, 7, 10",
        "BOSTON Wd. 16, Pcts. 2, 5, 7, 9, 10, 12",
        "BOSTON Wd. 19, Pcts. 1, 2, 3, 4, 5, 6, 8, 9 ",
        "BOSTON Wd. 20, Pcts. 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20"
    };
    String[] precinctNamesDistrict9 = {
        "Barnstable",
        "Bourne",
        "Brewster",
        "Chatham ",
        "Dennis",
        "Eastham",
        "Falmouth",
        "Harwich ",
        "Mashpee",
        "Orleans",
        "Provincetown",
        "Sandwich ",
        "Truro",
        "Wellfleet",
        "Yarmouth",
        "Acushnet",
        "Dartmouth",
        "Fairhaven",
        "FALL RIVER ",
        "FALL RIVER Wds. 1, 2, 3",
        "FALL RIVER Wd. 4, Pcts. A, B",
        "FALL RIVER Wd. 5, Pcts. A, B ",
        "FALL RIVER Wd. 6",
        "NEW BEDFORD",
        "Westport",
        "Aquinnah",
        "Chilmark",
        "Edgartown ",
        "Gosnold ",
        "Oak Bluffs",
        "Tisbury ",
        "West Tisbury",
        "Nantucket",
        "Carver",
        "Duxbury",
        "Halifax",
        "Hanover",
        "Hanson",
        "Kingston",
        "Marion",
        "Marshfield",
        "Mattapoisett",
        "Middleborough ",
        "Norwell",
        "Pembroke",
        "Plymouth",
        "Plympton",
        "Rochester",
        "Rockland",
        "Wareham"};

    public ArrayList<Precinct> formPrecincts(int id) {
        ArrayList<Precinct> x = new ArrayList<Precinct>();
        long pop = 6547629;
        long sizes = precinctNamesDistrict1.length + precinctNamesDistrict2.length + precinctNamesDistrict3.length + precinctNamesDistrict4.length + precinctNamesDistrict5.length + precinctNamesDistrict6.length + precinctNamesDistrict7.length + precinctNamesDistrict8.length + precinctNamesDistrict9.length;
        long popd = pop / sizes;

        switch (id) {
            case 0:
                for (String precinctNamesDistrict11 : precinctNamesDistrict1) {
                    Precinct p = new Precinct();
                    p.setName(precinctNamesDistrict11);
                    Statistics st = new Statistics();
                    st.setPopulation(popd);
                    p.setStatistics(st);
                    p.setYear(2016);
                    p.setCongressionalDistrictId(id);
                    //p.setAdj
                    x.add(p);
                }
                break;
            case 1:
                for (int i = 0; i < precinctNamesDistrict2.length; i++) {
                    Precinct p = new Precinct();
                    p.setName(precinctNamesDistrict2[i]);
                    Statistics st = new Statistics();
                    st.setPopulation(popd);
                    p.setStatistics(st);
                    p.setYear(2016);
                    p.setCongressionalDistrictId(id);
                    x.add(p);
                }
                break;
            case 2:
                for (int i = 0; i < precinctNamesDistrict3.length; i++) {
                    Precinct p = new Precinct();
                    p.setName(precinctNamesDistrict3[i]);
                    Statistics st = new Statistics();
                    st.setPopulation(popd);
                    p.setStatistics(st);
                    p.setYear(2016);
                    p.setCongressionalDistrictId(id);
                    x.add(p);
                }
                break;
            case 3:
                for (int i = 0; i < precinctNamesDistrict4.length; i++) {
                    Precinct p = new Precinct();
                    p.setName(precinctNamesDistrict4[i]);
                    Statistics st = new Statistics();
                    st.setPopulation(popd);
                    p.setStatistics(st);
                    p.setYear(2016);
                    p.setCongressionalDistrictId(id);
                    x.add(p);
                }
                break;
            case 4:
                for (int i = 0; i < precinctNamesDistrict5.length; i++) {
                    Precinct p = new Precinct();
                    p.setName(precinctNamesDistrict5[i]);
                    Statistics st = new Statistics();
                    st.setPopulation(popd);
                    p.setStatistics(st);
                    p.setYear(2016);
                    p.setCongressionalDistrictId(id);
                    x.add(p);
                }
                break;
            case 5:
                for (int i = 0; i < precinctNamesDistrict6.length; i++) {
                    Precinct p = new Precinct();
                    p.setName(precinctNamesDistrict6[i]);
                    Statistics st = new Statistics();
                    st.setPopulation(popd);
                    p.setStatistics(st);
                    p.setYear(2016);
                    p.setCongressionalDistrictId(id);
                    x.add(p);
                }
                break;
            case 6:
                for (int i = 0; i < precinctNamesDistrict7.length; i++) {
                    Precinct p = new Precinct();
                    p.setName(precinctNamesDistrict7[i]);
                    Statistics st = new Statistics();
                    st.setPopulation(popd);
                    p.setYear(2016);
                    p.setStatistics(st);
                    p.setCongressionalDistrictId(id);
                    x.add(p);

                }
                break;
            case 7:
                for (int i = 0; i < precinctNamesDistrict8.length; i++) {
                    Precinct p = new Precinct();
                    p.setName(precinctNamesDistrict8[i]);
                    Statistics st = new Statistics();
                    st.setPopulation(popd);
                    p.setStatistics(st);
                    p.setYear(2016);
                    p.setCongressionalDistrictId(id);
                    x.add(p);
                }
                break;
            case 8:
                for (int i = 0; i < precinctNamesDistrict9.length; i++) {
                    Precinct p = new Precinct();
                    p.setName(precinctNamesDistrict9[i]);
                    Statistics st = new Statistics();
                    st.setPopulation(popd);
                    p.setStatistics(st);
                    p.setYear(2016);
                    p.setCongressionalDistrictId(id);
                    x.add(p);
                }
                break;
            default:
                break;
        }
        return x;
    }

    public void randomAdj(State s) {
        Random rand = new Random();

        ArrayList<CongressionalDistrict> cdlist = s.getDistricts();
        for (int i = 0; i < cdlist.size(); i++) {
            ArrayList<Precinct> p = cdlist.get(i).getPrecincts().get(2016);
            ArrayList<Precinct> n = new ArrayList<Precinct>();
            for (int k = 0; k < p.size(); k++) {
                for (int j = 0; j < 2; j++) {
                    int rando = rand.nextInt(8);
                    CongressionalDistrict c = s.getDistrictById(rando);
                    Precinct rs = c.getPrecinctsByYear(2016).get(rand.nextInt(c.getPrecinctsByYear(2016).size()));
                    if (rs.getCongressionalDistrictId() != i) {
                        rs.setBorder(true);
                    }
                    n.add(rs);
                }
                p.get(k).setAdjacentPrecincts(n);
            }
        }

    }
}
