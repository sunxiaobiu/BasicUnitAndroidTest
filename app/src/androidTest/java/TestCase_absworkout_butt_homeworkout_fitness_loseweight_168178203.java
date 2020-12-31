import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.preference.PreferenceManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_absworkout_butt_homeworkout_fitness_loseweight_168178203 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      var2 = var2.getApplicationContext();
      SharedPreferences var3 = PreferenceManager.getDefaultSharedPreferences(var2);
      Object var1 = null;
      var3.registerOnSharedPreferenceChangeListener((OnSharedPreferenceChangeListener)var1);
   }
}
