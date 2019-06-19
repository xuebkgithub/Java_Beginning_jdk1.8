package com.alguigu.exer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAO<T> {
  private Map<String, T> map = new HashMap<String, T>();

  public void save(String id, T entity){
    this.map.put(id, entity);
  }

  public T get(String id){
    return this.map.get(id);
  }

  public void update(String id, T entity){
    save(id, entity);
  }

  public List<T> list(){
    List<T> list = new ArrayList<T>();
    for (String s: this.map.keySet()){
      list.add(this.get(s));
    }
    return list;
  }

  public void delete(String id){
    this.map.remove(id);
  }
}
