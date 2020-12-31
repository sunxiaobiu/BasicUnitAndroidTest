import androidx.test.runner.AndroidJUnit4;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkRequest;
import androidx.work.Worker;
import androidx.work.OneTimeWorkRequest.Builder;
import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59F702328443B334BD7F92559E1F83BFFA05A848788CA5083194BF5F3692D66B__967216100 {
   @Test
   public void testCase() throws Exception {
      Builder var2 = new Builder(Worker.class);
      androidx.work.Data.Builder var1 = new androidx.work.Data.Builder();
      Data var4 = var1.build();
      androidx.work.WorkRequest.Builder var6 = var2.setInputData(var4);
      var2 = (Builder)var6;
      StringBuilder var8 = new StringBuilder();
      String var9 = var8.toString();
      var2.addTag(var9);
      WorkRequest var3 = var2.build();
      OneTimeWorkRequest var5 = (OneTimeWorkRequest)var3;
      UUID var7 = var5.getId();
   }
}
