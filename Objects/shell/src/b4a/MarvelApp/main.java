
package b4a.MarvelApp;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4a.MarvelApp.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _selected = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _character = RemoteObject.declareNull("b4a.MarvelApp.charactercontroller");
public static RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
public static RemoteObject _ime = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static RemoteObject _charlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _searchbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _send = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _loading = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _characterlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.MarvelApp.url _url = null;
public static b4a.MarvelApp.characterdetails _characterdetails = null;
public static b4a.MarvelApp.charrelatedinfoview _charrelatedinfoview = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"character",main.mostCurrent._character,"CharacterDetails",Debug.moduleToString(b4a.MarvelApp.characterdetails.class),"characterList",main.mostCurrent._characterlist,"charList",main.mostCurrent._charlist,"CharRelatedInfoView",Debug.moduleToString(b4a.MarvelApp.charrelatedinfoview.class),"HttpUtils2Service",main.mostCurrent._httputils2service,"IME",main.mostCurrent._ime,"jsonParser",main.mostCurrent._jsonparser,"loading",main.mostCurrent._loading,"searchBar",main.mostCurrent._searchbar,"selected",main._selected,"send",main.mostCurrent._send,"url",Debug.moduleToString(b4a.MarvelApp.url.class)};
}
}