import android.app.Application;
import androidx.test.runner.AndroidJUnit4;
import java.io.File;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_03E3A2E3B45D58DB8159EB2428FDE6937DD8FB711A7004B5840D5B43B1D73D27__1915412580 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Application.class);
      File var2 = ((Application)var1).getDataDir();
   }
}
