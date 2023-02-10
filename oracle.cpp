/**
 * oracle.c
 * 
 * prompts the user for a question, provides an answer via a hexagram
 * as well as the resulting hexagram after finding any changing lines
*/
#include <iostream>

using namespace std;

string OPEN = "       _____  _____\n";
string CLOSED = "       ____________\n";
int HEXAGRAM[ 6 ] = { 0 };

int line() 
{
  int line = 0;

  for ( int i = 0; i < 3; i++ )
  {
   if ( rand() % 2 == 1 )
    {
      line++;
    }
  }

  return line;
}

void buildHexagram()
{
  for ( int i = 0; i < 6; i++ )
  {
    HEXAGRAM[ i ] = line();
  }
}

string drawLine( int line )
{
  if ( line == 0 || line == 2 )
  {
    return OPEN;
  }
  return CLOSED;
}

string drawHexagram()
{
  string hexagram = "";
  for ( int i = 0; i < 6; i++ )
  {
    hexagram += drawLine( HEXAGRAM[ i ] );
  }
  return hexagram;
}

bool transform()
{
  bool changing = false;

  for ( int i = 5; i >= 0; i-- )
  {
    if ( HEXAGRAM[ i ] == 0 || HEXAGRAM[ i ] == 3 )
    {
      if ( changing == false )
      {
        cout << "\n\n  The lines that changed: ";
      }
      changing = true;
      printf( "%d ", 6 - i );
      if ( HEXAGRAM[ i ] == 0 )
      {
        HEXAGRAM[ i ] = 3;
      }
      else if ( HEXAGRAM[ i ] == 3 )
      {
        HEXAGRAM[ i ] = 0;
      }
    }
  }
  return changing;
}

string find( string hexagram );

void printHexagram()
{
  string hexagram = drawHexagram();
  string name = find( hexagram );

  cout << endl << hexagram << endl;
  cout << endl << "    " << name << endl;
}

int main()
{
  cout << "\nAsk a question and press enter.\n\n";

  srand( ( unsigned ) time( NULL ) );
  string question;
  cin >> question;
  cout << endl;

  buildHexagram();

  printHexagram();

  cout << endl;

  if ( transform() )
  {
    cout << "\n\n    Resulting hexagram:\n" << endl;
    printHexagram();
  }
  else
  {
    cout << "    No changing lines." << endl;
  }

  cout << endl << endl;
}

string find( string hexagram ) 
{
  if ( hexagram == CLOSED + CLOSED + CLOSED +
      CLOSED + CLOSED + CLOSED ) 
  {
      return "01 • The Dynamic";
  }
  if ( hexagram == OPEN + OPEN + OPEN +
      OPEN + OPEN + OPEN ) 
  {
      return "02 • The Magnetic";
  }
  if ( hexagram == CLOSED + OPEN + OPEN +
      OPEN + CLOSED + OPEN ) 
  {
      return "03 • Difficulty";
  }
  if ( hexagram == OPEN + CLOSED + OPEN +
      OPEN + OPEN + CLOSED ) 
  {
      return "04 • Inexperience";
  }
  if ( hexagram == CLOSED + CLOSED + CLOSED +
      OPEN + CLOSED + OPEN ) 
  {
      return "05 • Waiting";
  }
  if ( hexagram == OPEN + CLOSED + OPEN +
      CLOSED + CLOSED + CLOSED ) 
  {
      return "06 • Stress";
  }
  if ( hexagram == OPEN + CLOSED + OPEN +
      OPEN + OPEN + OPEN ) 
  {
      return "07 • Discipline";
  }
  if ( hexagram == OPEN + OPEN + OPEN +
      OPEN + CLOSED + OPEN )
  {
      return "08 • Holding Together";
  }
  if ( hexagram == CLOSED + CLOSED + CLOSED +
      OPEN + CLOSED + CLOSED ) 
  {
      return "09 • Passive Restraint";
  }
  if ( hexagram == CLOSED + CLOSED + OPEN +
      CLOSED + CLOSED + CLOSED )
  {
      return "10 • Cautious Advance";
  }
  if ( hexagram == CLOSED + CLOSED + CLOSED +
      OPEN + OPEN + OPEN )
  {
      return "11 • Harmony";
  }
  if ( hexagram == OPEN + OPEN + OPEN +
      CLOSED + CLOSED + CLOSED ) 
  {
      return "12 • Divorcement";
  }
  if ( hexagram == CLOSED + OPEN + CLOSED +
      CLOSED + CLOSED + CLOSED ) 
  {
      return "13 • Union of Forces";
  }
  if ( hexagram == CLOSED + CLOSED + CLOSED +
      CLOSED + OPEN + CLOSED ) 
  {
      return "14 • Wealth";
  }
  if ( hexagram == OPEN + OPEN + CLOSED +
      OPEN + OPEN + OPEN ) 
  {
      return "15 • Temperance";
  }
  if ( hexagram == OPEN + OPEN + OPEN +
      CLOSED + OPEN + OPEN ) 
  {
      return "16 • Enthusiasm/Self-Deception/Repose";
  }
  if ( hexagram == CLOSED + OPEN + OPEN +
      CLOSED + CLOSED + OPEN ) 
  {
      return "17 • Following";
  }
  if ( hexagram == OPEN + CLOSED + CLOSED +
      OPEN + OPEN + CLOSED )
  {
      return "18 • Repair";
  }
  if ( hexagram == CLOSED + CLOSED + OPEN +
      OPEN + OPEN + OPEN )
  {
      return "19 • Approach";
  }
  if ( hexagram == OPEN + OPEN + OPEN +
      OPEN + CLOSED + CLOSED )
  {
      return "20 • Contemplation";
  }
  if ( hexagram == CLOSED + OPEN + OPEN +
      CLOSED + OPEN + CLOSED )
  {
      return "21 • Discernment";
  }
  if ( hexagram == CLOSED + OPEN + CLOSED +
      OPEN + OPEN + CLOSED )
  {
      return "22 • Persona";
  }
  if ( hexagram == OPEN + OPEN + OPEN +
      OPEN + OPEN + CLOSED ) 
  {
      return "23 • Disintegration";
  }
  if ( hexagram == CLOSED + OPEN + OPEN +
      OPEN + OPEN + OPEN )
  {
      return "24 • Return";
  }
  if ( hexagram == CLOSED + OPEN + OPEN +
      CLOSED + CLOSED + CLOSED )
  {
      return "25 • Innocence";
  }
  if ( hexagram == CLOSED + CLOSED + CLOSED +
      OPEN + OPEN + CLOSED )
  {
      return "26 • Controlled Power";
  }
  if ( hexagram == CLOSED + OPEN + OPEN +
      OPEN + OPEN + CLOSED )
  {
      return "27 • Nourishment";
  }
  if ( hexagram == OPEN + CLOSED + CLOSED +
      CLOSED + CLOSED + OPEN )
  {
      return "28 • Critical Mass";
  }
  if ( hexagram == OPEN + CLOSED + OPEN +
      OPEN + CLOSED + OPEN )
  {
      return "29 • Danger";
  }
  if ( hexagram == CLOSED + OPEN + CLOSED +
      CLOSED + OPEN + CLOSED )
  {
      return "30 • Clarity";
  }
  if ( hexagram == OPEN + OPEN + CLOSED +
      CLOSED + CLOSED + OPEN ) 
  {
      return "31 • Initiative (Influence)";
  }
  if ( hexagram == OPEN + CLOSED + CLOSED +
      CLOSED + OPEN + OPEN ) 
  {
      return "32 • Consistency";
  }
  if ( hexagram == OPEN + OPEN + CLOSED +
      CLOSED + CLOSED + CLOSED )
  {
      return "33 • Retreat";
  }
  if ( hexagram == CLOSED + CLOSED + CLOSED +
      CLOSED + OPEN + OPEN )
  {
      return "34 • Great Power";
  }
  if ( hexagram == OPEN + OPEN + OPEN +
      CLOSED + OPEN + CLOSED )
  {
      return "35 • Advance of Consciousness";
  }
  if ( hexagram == CLOSED + OPEN + CLOSED +
      OPEN + OPEN + OPEN )
  {
      return "36 • Clouded Perception";
  }
  if ( hexagram == CLOSED + OPEN + CLOSED +
      OPEN + CLOSED + CLOSED )
  {
      return "37 • The Family";
  }
  if ( hexagram == CLOSED + CLOSED + OPEN +
      CLOSED + OPEN + CLOSED )
  {
      return "38 • Mutual Alienation";
  }
  if ( hexagram == OPEN + OPEN + CLOSED +
      OPEN + CLOSED + OPEN )
  {
      return "39 • Impasse";
  }
  if ( hexagram == OPEN + CLOSED + OPEN +
      CLOSED + OPEN + OPEN )
  {
      return "40 • Liberation";
  }
  if ( hexagram == CLOSED + CLOSED + OPEN +
      OPEN + OPEN + CLOSED )
  {
      return "41 • Compensating Sacrifice";
  }
  if ( hexagram == CLOSED + OPEN + OPEN +
      OPEN + CLOSED + CLOSED )
  {
      return "42 • Increase";
  }
  if ( hexagram == CLOSED + CLOSED + CLOSED +
      CLOSED + CLOSED + OPEN )
  {
      return "43 • Resoluteness";
  }
  if ( hexagram == OPEN + CLOSED + CLOSED +
      CLOSED + CLOSED + CLOSED )
  {
      return "44 • Temptation";
  }
  if ( hexagram == OPEN + OPEN + OPEN +
      CLOSED + CLOSED + OPEN )
  {
      return "45 • Gathering Together (Contraction)";
  }
  if ( hexagram == OPEN + CLOSED + CLOSED +
      OPEN + OPEN + OPEN )
  {
      return "46 • Pushing Upward";
  }
  if ( hexagram == OPEN + CLOSED + OPEN +
      CLOSED + CLOSED + OPEN )
  {
      return "47 • Oppression";
  }
  if ( hexagram == OPEN + CLOSED + CLOSED +
      OPEN + CLOSED + OPEN )
  {
      return "48 • The Well";
  }
  if ( hexagram == CLOSED + OPEN + CLOSED +
      CLOSED + CLOSED + OPEN )
  {
      return "49 • Metamorphosis";
  }
  if ( hexagram == OPEN + CLOSED + CLOSED +
      CLOSED + OPEN + CLOSED )
  {
      return "50 • The Sacrificial Vessel";
  }
  if ( hexagram == CLOSED + OPEN + OPEN +
      CLOSED + OPEN + OPEN )
  {
      return "51 • Shock/Thunder";
  }
  if ( hexagram == OPEN + OPEN + CLOSED +
      OPEN + OPEN + CLOSED )
  {
      return "52 • Keeping Still";
  }
  if ( hexagram == OPEN + OPEN + CLOSED +
      OPEN + CLOSED + CLOSED )
  {
      return "53 • Gradual Progress";
  }
  if ( hexagram == CLOSED + CLOSED + OPEN +
      CLOSED + OPEN + OPEN )
  {
      return "54 • Propriety/Making-Do";
  }
  if ( hexagram == CLOSED + OPEN + CLOSED +
      CLOSED + OPEN + OPEN )
  {
      return "55 • Abundance (Expansion of Awareness)";
  }
  if ( hexagram == OPEN + OPEN + CLOSED +
      CLOSED + OPEN + CLOSED )
  {
      return "56 • Transition";
  }
  if ( hexagram == OPEN + CLOSED + CLOSED +
      OPEN + CLOSED + CLOSED )
  {
      return "57 • Penetration";
  }
  if ( hexagram == CLOSED + CLOSED + OPEN +
      CLOSED + CLOSED + OPEN )
  {
      return "58 • Joy (Self-indulgence)";
  }
  if ( hexagram == OPEN + CLOSED + OPEN +
      OPEN + CLOSED + CLOSED )
  {
      return "59 • Expansion (Dispersion)";
  }
  if ( hexagram == CLOSED + CLOSED + OPEN +
      OPEN + CLOSED + OPEN )
  {
      return "60 • Restrictive Regulations";
  }
  if ( hexagram == CLOSED + CLOSED + OPEN +
      OPEN + CLOSED + CLOSED )
  {
      return "61 • Inner Truth";
  }
  if ( hexagram == OPEN + OPEN + CLOSED +
      CLOSED + OPEN + OPEN )
  {
      return "62 • Small Powers";
  }
  if ( hexagram == CLOSED + OPEN + CLOSED +
      OPEN + CLOSED + OPEN )
  {
      return "63 • Completion";
  }
  return "64 • Unfinished Business";
}
