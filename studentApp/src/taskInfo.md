### İmtahan Tipli Task: Akademiya İdarəetmə Sistemi

#### Verilənlər:
Sizdən tələb olunur, **Academy** adlı əsas bir sinif və ondan miras alan iki sinif (**Student** və **Teacher**) yaratmaq.
Siniflərin aşağıda göstərilən xüsusiyyətləri və metodları olmalıdır:

---

### 1. **Academy Sinifi**
Bu sinif, ümumi akademiya məlumatlarını saxlayır və aşağıdakı xüsusiyyətlərə malikdir:
- **Xüsusiyyətlər (Fields):**
    - `name`: Akademiyanın adı.
    - `address`: Akademiyanın ünvanı.

- **Metodlar:**
    - `displayInfo`: Akademiyanın adı və ünvanını ekranda göstərir.

- **Constructor və Setter/Getter-lər:**
    - Həm `name`, həm də `address` üçün constructor, setter və getter metodları yaradılmalıdır.

---

### 2. **Student Sinifi**
Bu sinif, **Academy** sinifindən miras alır və tələbələrə aid məlumatları saxlayır:
- **Xüsusiyyətlər (Fields):**
    - `studentId`: Tələbənin unikal ID nömrəsi.
    - `course`: Tələbənin aldığı kursun adı.

- **Metodlar:**
    - `study`: Bu metod, tələbənin ID nömrəsi və kursu haqqında mesaj çap edir. Məsələn:
      > "123 nömrəli tələbə Java kursunu alır."

- **Constructor və Setter/Getter-lər:**
    - Həm `studentId`, həm də `course` üçün constructor, setter və getter metodları yaradılmalıdır.

---

### 3. **Teacher Sinifi**
Bu sinif, **Academy** sinifindən miras alır və müəllimlərə aid məlumatları saxlayır:
- **Xüsusiyyətlər (Fields):**
    - `teacherId`: Müəllimin unikal ID nömrəsi.
    - `subject`: Müəllimin tədris etdiyi fənn.

- **Metodlar:**
    - `teach`: Bu metod, müəllimin ID nömrəsi və tədris etdiyi fənn haqqında mesaj çap edir. Məsələn:
      > "101 nömrəli müəllim Riyaziyyat fənnini tədris edir."

- **Constructor və Setter/Getter-lər:**
    - Həm `teacherId`, həm də `subject` üçün constructor, setter və getter metodları yaradılmalıdır.

---

### 4. **Main Sinifi**
Bu sinifdə aşağıdakıları həyata keçirin:
1. **Academy**, **Student** və **Teacher** siniflərindən obyektlər yaradın.
2. Hər bir obyekt üçün mövcud metodları çağıraraq, məlumatları ekranda çap edin.
3. Çap nəticələri real və anlaşılan olmalıdır. Məsələn:
    - "Akademiya: Future Academy, Ünvan: Bakı, Azərbaycan"
    - "123 nömrəli tələbə Java kursunu alır."
    - "101 nömrəli müəllim Riyaziyyat fənnini tədris edir."

---

### Qeydlər:
1. Siniflər obyekt yönümlü proqramlaşdırma prinsiplərinə uyğun olaraq yaradılmalıdır.
2. Miras (inheritance) istifadəsinə diqqət edin.
3. Hər bir metod və xüsusiyyətin düzgün və funksional olmasını təmin edin.
4. Çap olunan mesajlar oxunaqlı və tam olsun.

