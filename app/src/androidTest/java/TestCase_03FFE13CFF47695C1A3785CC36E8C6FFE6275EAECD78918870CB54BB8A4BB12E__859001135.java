import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_03FFE13CFF47695C1A3785CC36E8C6FFE6275EAECD78918870CB54BB8A4BB12E__859001135 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Configuration.class);
      LocaleList var2 = ((Configuration)var1).getLocales();
      boolean var3 = var2.isEmpty();
   }
}
