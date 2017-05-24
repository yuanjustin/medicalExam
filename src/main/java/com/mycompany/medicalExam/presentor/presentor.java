package com.mycompany.medicalExam.presentor;

public class presentor
{
	


MainModel mainModel;
MethodListModel  methodListModel;
SearchModel searchModel;
	
	Data data;

	MainView mainView;
	SearchView searchView;
	MethodListView methodListView;
	DetailView detailView;
	List<detailModel> search( String str)
	{
		//search todo
	}
	void showDetail(int sIndex, int mInde, int cIndex){
		mainModel.setSystemIndex(-1);
		model.getDetail(sIndex,mInde,cIndex);
	}
	void showList(int index){
		mainModel.setSystemIndex(index);
		mainView.refreshView(model);
	}
	void showSearch(String str){
		mainModel.setSystemIndex(0);
		mainView.refreshView(model);
	}
	void showAbout(){}
	
	void star(){
		//get the data
	data = new Data();
		//initial
	mainModel=new MainModel();//initial index
  methodListModel=new MethodListModel();
 searchModel=new SearchModel ();	
mainView=new MainView();
	 searchView =new SearchView ();
	 methodListView=new MethodListView ();		
		//initial model 
		
	mainView.refreshView(mainModel);
	methodListView.refreshView(methodListModel);
	
	}
	void SearchChange( String str){
	model.setSearch(str);
	model.refrshSearch(search(model.getSearch));
	}
	}
