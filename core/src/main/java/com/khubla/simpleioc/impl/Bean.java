package com.khubla.simpleioc.impl;

/**
 * @author tome
 */
public class Bean {
   private boolean threadlocal;
   private boolean autocreate;
   private boolean cache;
   private String clazz;
   private String name;
   private String profile;

   public String getClazz() {
      return clazz;
   }

   public String getName() {
      return name;
   }

   public String getProfile() {
      return profile;
   }

   public boolean isAutocreate() {
      return autocreate;
   }

   public boolean isCache() {
      return cache;
   }

   public boolean isThreadlocal() {
      return threadlocal;
   }

   public void setAutocreate(boolean autocreate) {
      this.autocreate = autocreate;
   }

   public void setCache(boolean cache) {
      this.cache = cache;
   }

   public void setClazz(String clazz) {
      this.clazz = clazz;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setProfile(String profile) {
      this.profile = profile;
   }

   public void setThreadlocal(boolean threadlocal) {
      this.threadlocal = threadlocal;
   }
}