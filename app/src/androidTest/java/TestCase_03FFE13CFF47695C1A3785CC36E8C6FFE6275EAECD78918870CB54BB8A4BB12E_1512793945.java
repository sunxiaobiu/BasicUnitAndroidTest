import android.os.LocaleList;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_03FFE13CFF47695C1A3785CC36E8C6FFE6275EAECD78918870CB54BB8A4BB12E_1512793945 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(LocaleList.class);
      LocaleList.setDefault((LocaleList)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
