import androidx.test.runner.AndroidJUnit4;
import androidx.work.Data;
import androidx.work.WorkInfo;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59F702328443B334BD7F92559E1F83BFFA05A848788CA5083194BF5F3692D66B__1643926675 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(WorkInfo.class);
      Data var2 = ((WorkInfo)var1).getOutputData();
      String var3 = var2.getString("ocorrencia");
   }
}
