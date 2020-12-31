import android.os.Bundle;
import android.os.Parcelable;
import android.os.Parcelable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_014117FE8FF081C26E42C43B5EAEA0246CE8A15FDE0BED5DD61231948A8E2EF6_1524724076 {
   @Test
   public void testCase() throws Exception {
      Bundle var2 = new Bundle();
      Object var3 = EasyMock.createMock(Parcelable[].class);
      Object var1 = EasyMock.createMock(Bundle.class);
      ((Bundle)var1).putParcelableArray("list", (Parcelable[])var3);
   }
}
