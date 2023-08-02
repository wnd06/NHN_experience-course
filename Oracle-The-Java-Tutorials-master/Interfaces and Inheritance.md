# Interfaces and Inheritance



## Interfaces



### Defining an Interface

~~~java
[<access modifier>] interface <name> [extends <parent interface>[,...]] {
  ...
} 
~~~

* Access modifier
  * public - 모든 패키지에서 접근 가능
  * default - 동일 패키지에서만 접근 가능

* 다중 상속 지원

  * 클래스는 지원되지 않으나, 쉼표를 이용해 하나 이상의 interface 나열 가능

#### Interface Body
* Method 정의
    * Abstract method
      * method signature만 선언되어 있고, 본문은 없음
      * abstract keyword 사용하지 않음

    * Default method
      * default keyword로 정의

    * Static method
      * static keyword로 정의

*  access modifier level
  * public 기본(표기하기 않을 경우)

* 상수 선언
  * 필드 선언시 상수
  * public, static, final 기본




### Implementing an Interface

* interface를 이용한 class 구현시 implements keyword 사용

  ~~~java
  class MyClass implements MyInterface {
    ...
  }
  ~~~



#### 예제. Relatable interface를 정의하고, 클래스로 구현해 보자.

* Relatable interface를 정의한다.

  ~~~java
  public interface Relatable {
  
      // this (object calling isLargerThan)
      // and other must be instances of 
      // the same class returns 1, 0, -1 
      // if this is greater than, 
      // equal to, or less than other
      public int isLargerThan(Relatable other);
  }
  ~~~
  * public interface이므로, 패키지와 상관없이 접근 가능
  * isLargerThan method의 access modifier는 public이 기본이므로 ,생략 가능

* interface를 이용한 구현

  ~~~java
  public class RectanglePlus 
      implements Relatable {
      public int width = 0;
      public int height = 0;
      public Point origin;
  
      // four constructors
      public RectanglePlus() {
          origin = new Point(0, 0);
      }
      public RectanglePlus(Point p) {
          origin = p;
      }
      public RectanglePlus(int w, int h) {
          origin = new Point(0, 0);
          width = w;
          height = h;
      }
      public RectanglePlus(Point p, int w, int h) {
          origin = p;
          width = w;
          height = h;
      }
  
      // a method for moving the rectangle
      public void move(int x, int y) {
          origin.x = x;
          origin.y = y;
      }
  
      // a method for computing
      // the area of the rectangle
      public int getArea() {
          return width * height;
      }
      
      // a method required to implement
      // the Relatable interface
      public int isLargerThan(Relatable other) {
          RectanglePlus otherRect 
              = (RectanglePlus)other;
          if (this.getArea() < otherRect.getArea())
              return -1;
          else if (this.getArea() > otherRect.getArea())
              return 1;
          else
              return 0;               
      }
  }
  
  ~~~

  * interface에서 정의한 isLargerThan 구현
  * 나머지는 해당 클래스의 필요에 따라 구현

  

### Using an Interface as a Type

* interface는 reference type
* interface를 data type으로 하는 변수에는 해당 interface를 구현한 클래스의 인스턴스를 참조 시킬 수 있음

#### 예제. Interface를 data type으로 사용해 보자.

아래의 코드를 보자.

~~~java
public Object findLargest(Object object1, Object object2) {
   Relatable obj1 = (Relatable)object1;
   Relatable obj2 = (Relatable)object2;
   if ((obj1).isLargerThan(obj2) > 0)
      return object1;
   else 
      return object2;
}
~~~

* object1과 object2를 Relatable data type으로 타입 변환
* object1과 object2에 대해 실질적인 클래스 상속 관계에 상관없이 Relatable interface의 구현만 적용되면 비교 가능
* 개별 비교(isLargerThan)는 구현에서 처리



### Evolving Interfaces

* DoIt interface 정의

  ~~~java
  public interface DoIt {
     void doSomething(int i, double x);
     int doSomethingElse(String s);
  }
  ~~~

* interface에 method 추가시 문제점

  * 해당 interface를 구현해야 하는 모든 클래스 method 추가 필요 

  ~~~java
  public interface DoIt {
     void doSomething(int i, double x);
     int doSomethingElse(String s);
     boolean didItWork(int i, double x, String s); // 추가
  }
  ~~~

  

* extends keyword를 이용해 interface 확장 가능

  ~~~java
  public interface DoItPlus extends DoIt {
     boolean didItWork(int i, double x, String s); // 추가
  }
  ~~~

* 또는, default 적용

  ~~~java
  public interface DoIt {
  
     void doSomething(int i, double x);
     int doSomethingElse(String s);
     default boolean didItWork(int i, double x, String s) {
         // Method body 
     }   
  }
  ~~~

  

  #### 예제. interface에 기능 추가 방법에 대해 확인해 보자.

// TODO : 내용 추가



### Default Methods

* Method에 대한 기본 기능을 정의하여 구현 클래스에서 해당 method를 구현하지 않더라도 적용 가능
* **interface** 기능 확장시 기존 interface 구현 클래스에서의 호환성 문제 해결



#### 예제. interface에 기능 추가시 발생할 수 있는 호환성 문제를 default method로 해결해 보자.

TimeClient interface는 아래와 같다.

~~~java
package example;

import java.time.LocalDateTime; 
 
public interface TimeClient {
    void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second);
    LocalDateTime getLocalDateTime();
}
~~~



TimeClient interface를 이용해 구현한 SimpleTimeClient 클래스는 아래와 같다.

~~~java
package example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class SimpleTimeClient implements TimeClient {

    private LocalDateTime dateAndTime;

    public SimpleTimeClient() {
        dateAndTime = LocalDateTime.now();
    }

    public void setTime(int hour, int minute, int second) {
        LocalDate currentDate = LocalDate.from(dateAndTime);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(currentDate, timeToSet);
    }

    public void setDate(int day, int month, int year) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime currentTime = LocalTime.from(dateAndTime);
        dateAndTime = LocalDateTime.of(dateToSet, currentTime);
    }

    public void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
    }

    public LocalDateTime getLocalDateTime() {
        return dateAndTime;
    }

    public String toString() {
        return dateAndTime.toString();
    }

    public static void main(String [] args) {
        TimeClient myTimeClient = new SimpleTimeClient();
        System.out.println(myTimeClient.toString());
    }
}
~~~



코드 작성이 끝났다면 실행해 결과를 확인하자.

~~~sh
2023-05-22T21:39:45.522852
~~~



##### 예제. TimeClient에 새로운 method를 추가해 보자.

* 아래의 method를 추가한다.

  ```java
  package example;
   
  import java.time.LocalDateTime;
  
  public interface TimeClient {
      void setTime(int hour, int minute, int second);
      void setDate(int day, int month, int year);
      void setDateAndTime(int day, int month, int year,
          int hour, int minute, int second);
      LocalDateTime getLocalDateTime();                           
      ZonedDateTime getZonedDateTime(String zoneString); // 추가
  }
  ```

* 빌드하여 결과를 확인한다. 정상적으로 빌드가 되나?



##### 예제. 앞에서 설명한 것과 같이 default method로 추가해 보자.

* Method getZonedDateTime을 default method로 정의한다.

  ~~~java
  package example;
   
  import java.time.LocalDateTime;
  
  public interface TimeClient {
      void setTime(int hour, int minute, int second);
      void setDate(int day, int month, int year);
      void setDateAndTime(int day, int month, int year,
                                 int hour, int minute, int second);
      LocalDateTime getLocalDateTime();
      
      static ZoneId getZoneId (String zoneString) {
          try {
              return ZoneId.of(zoneString);
          } catch (DateTimeException e) {
              System.err.println("Invalid time zone: " + zoneString +
                  "; using default time zone instead.");
              return ZoneId.systemDefault();
          }
      }
          
      default ZonedDateTime getZonedDateTime(String zoneString) {							// default 추가
          return ZonedDateTime.of(getLocalDateTime(), getZoneId(zoneString));
      }
  }
  ~~~

* 빌드하여 결과를 확인한다. 정상적으로 빌드가 되나?



##### 예제. 테스트 프로그램을 작성하여 추가된 method가 정상적으로 동작하는지 확인해 보자.

* 아래와 같이 getZonedDateTime을 호출하여 추가된 method 동작을 확인한다.

    ~~~java
    package example;
    
    public class TestSimpleTimeClient {
        public static void main(String [] args) {
            TimeClient myTimeClient = new SimpleTimeClient();
            System.out.println("Current time: " + myTimeClient.toString());
            System.out.println("Time in California: " +
                myTimeClient.getZonedDateTime("Blah blah").toString());
        }
    }
    
    ~~~

#### Extending Interfaces That Contain Default Methods

// TODO : 내용 추가

 

#### Static Methods

// TODO : 내용 추가

 

### Integrating Default Methods into Existing Libraries

// TODO : 내용 추가







### Summary of Interfaces

Interface에는 

* method signature
* default method
* static method
* 상수



이중에서 구현이 있는 method는

* default method
* static method



Interface를 구현하는 클래스는 

* interface에 선언된 모든 method를 구현해야 한다.
* 단, default method는 별도 구현하거나, 이미 구현되어 있는 코드를 이용할 수 있다.





## Inheritance(상속)

* subclass
  * Derived class
  * extended class
  * child class
* superclass
  * base class
  * parent class



### 상속

* subclass는 superclass의 모든 멤버((필드, method 및 중첩 클래스)를 상속한다.
* 생성자는 상속되지 않는다(멤버가 아님)
* 하지만, subclass에서 superclass의 생성자 호출 가능하다



#### Java 플랫폼 클래스 계층 구조

// TODO : 그림 추가

* Java의 Object 클래스는 모든 클래스의 최상위 클래스
* Object 클래스는 모든 클래스가 가져야 하는 공통 method 정의
* 명시적으로 superclass가 정의되지 않을 경우에도 Object 클래스의 상속을 받는다



#### 예제. MountainBike 클래스를 이용해 상속을 설명해 보자.

먼저 Bicycle 클래스를 다시 보자.

```java
public class Bicycle {
        
    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;
        
    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
        
}
```

* 3개의 필드
* 1개의 생성자
* 4개의 method 로 구성되어 있다.



MountainBike 클래스를 보자.

~~~java
public class MountainBike extends Bicycle {
        
    // the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   
}
~~~

* Bicycle 클래스를 상속하여 정의한다.

* 생성자에서는 super keyword를 이용해 superclass인 Bicycle 클래스의 상속자를 호출한다.

* 필드 seatHeight를 추가하고, 

* method setHeight를 추가하여 정의한다.

  

MountainBike 클래스는 Bicycle 클래스를 상속하였으므로,

* 4개의 필드
* 5개의 method로 구성된다.

생성자를 별도로 하나 정의되었다.



MountainBike 클래스 대부분의 method는 Bicycle 클래스에서 상속하여 정의하므로, Bicycle 클래스가 검증되었다면 최소한의 작업만으로 검증이 가능하다.



#### Subclass에서 할 수 있는 것들

subclass는 패키지와 관계없이 superclass의 public 또는 protected 멤버를 상속하고, 같은 패키지에 있는 경우에는 package-private 멤버도 상속한다.

- 상속된 필드는 다른 필드와 마찬가지로 직접 사용할 수 있다.
- 슈퍼클래스의 필드와 이름이 같은 서브클래스의 필드를 선언하여 숨길 수 있다 (권장하지 않음).
- 슈퍼클래스에 없는 서브클래스의 새 필드를 선언할 수 있다.
- 상속된 메서드는 그대로 사용할 수 있다.
- 슈퍼 클래스의 서명과 동일한 서명을 가진 새 인스턴스 메서드를 하위 클래스에 작성하여 *재정의* 할 수 있다.
- 슈퍼클래스의 서명과 동일한 서명을 가진 새 정적 메서드를 하위 클래스에 작성하여 *숨길* 수 있다 .
- 슈퍼클래스에 없는 새 메소드를 서브클래스에서 선언할 수 있다.
- 암시적으로 또는 super keyword를 사용하여 superclass의 생성자를 호출하는 subclass 생성자를 작성할 수 있습니다 .



### Multiple Inheritance of State, Implementation, and Type



### Overriding and Hiding Methods



### Polymorphism



### Hiding Fields



### Using the Keyword super Object as a Superclass





### Writing Final Classes and Methods





### Abstract Methods and Classes



### Summary of Inheritance



