import android.media.session.PlaybackState.CustomAction.Builder;
import android.os.Bundle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_64CCA2C12CCFD8B6B01A458339BEEE1469BDA3B0ECA7A58B4260B4347B05AAC9__1786074442 {
   @Test
   public void testCase() throws Exception {
      Builder var2 = new Builder("com.algoriddim.djay.emptyAction", "Empty", 2130837629);
      Object var1 = EasyMock.createMock(Bundle.class);
      var2.setExtras((Bundle)var1);
   }
}
